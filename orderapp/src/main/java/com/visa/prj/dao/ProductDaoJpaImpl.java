package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Product;

@Repository
public class ProductDaoJpaImpl implements ProductDao {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Product> getproducts() {
		String jpql = "from Product"; //     select p from Product p
		TypedQuery<Product> query = em.createQuery(jpql, Product.class);
		return null;
	}

	@Override
	public Product getproduct(int id) {
		return em.find(Product.class, id);
	}

	@Override
	public int addproduct(Product p) {
		em.persist(p); // insert
		return p.getId();
	}

}
