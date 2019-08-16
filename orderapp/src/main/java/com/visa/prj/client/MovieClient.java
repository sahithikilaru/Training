package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.dao.MovieDao;
import com.visa.prj.entity.Actor;
import com.visa.prj.entity.Movie;

public class MovieClient {
    public static void main(String[] args) {
        // create spring container
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        // ApplicationContext ctx= new ClassPathXmlApplicationContext("app.xml")
        
        ctx.scan("com.visa.prj");
        ctx.refresh();
        
        MovieDao dao= ctx.getBean("movieDao", MovieDao.class);
        
        Movie m= new Movie();
        m.setName("PulpFiction");
        
        Actor a1= new Actor();
        a1.setName("John Travota");
        
        Actor a2= new Actor();
        a2.setName("Usa Thruman");
        
        m.getActors().add(a1);
        m.getActors().add(a2);
        
        dao.addMovie(m);
        System.out.println("Saved!!!");
    }
}
