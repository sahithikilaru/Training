package com.visa.prj.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.dao.ProductDao;
import com.visa.prj.dao.ProductDaoJdbcImpl;
import com.visa.prj.entity.Product;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDao productDao = new ProductDaoJdbcImpl();
		try {
			List<Product> products = productDao.getProducts();
			request.setAttribute("products", products);
			request.getRequestDispatcher("list.jsp").forward(request, response);

		} catch (FetchException ex) {
			ex.printStackTrace();
			// out.print(e.getMessage());
		}

		/*
		 * response.setContentType("text/html"); //MIME type "application/ms-word"
		 * PrintWriter out = response.getWriter(); // for character stream //
		 * ServlllllletOutputStream out = response.getOutputStream(); //for byte stream
		 * out.print("<html><body>"); out.print("<table border = 1>");
		 * out.print("<tr><th>Name</th><th>Price</th></tr>");
		 * 
		 * ProductDao productDao = new ProductDaoJdbcImpl(); try { List<Product>
		 * products = productDao.getProducts(); products.forEach(p -> {
		 * out.print("<tr>"); out.print("<td>" + p.getName() + "</td>");
		 * out.print("<td>" + p.getPrice() + "</td>"); out.print("</tr>"); });
		 * 
		 * } catch (FetchException e) { e.printStackTrace(); out.print(e.getMessage());
		 * } out.print("</table></body></html>"); }
		 * 
		 * 
		 * protected void doPost(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException { ProductDao productDao = new
		 * ProductDaoJdbcImpl(); Product p = new Product();
		 * p.setName(request.getParameter("name"));
		 * p.setPrice(Double.parseDouble(request.getParameter("price")));
		 * p.setCategory(request.getParameter("category"));
		 * p.setCount(Integer.parseInt(request.getParameter("count"))); try {
		 * productDao.addProduct(p); response.sendRedirect("index.html"); } catch
		 * (PersistenceException e) { e.printStackTrace();
		 * response.sendRedirect("errorhandler?msg = " + e.getMessage()); // not
		 * implemented }
		 * 
		 * 
		 * // ,doGet(request, response); }
		 */

	}
}
