package com.scrud.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scrud.Dao.ProductDao;
import com.scrud.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Product> getProductAllList() {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("entered");
		Query query = session.createQuery("from Product");
		List<Product> result = query.list();
		session.flush();
		return result;
	}

	public Product getProductById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		return product;
	}

	public void addProduct(Product product) {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(product);
			session.flush();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void editProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println(product.getProductId());
		session.update(product);
		session.flush();
		System.out.println("updated");

	}

	public void deleteProduct(Product product) {
		
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from Product where productId=:I");
		query.setParameter("I", product.getProductId());
		query.executeUpdate();
	}

}
