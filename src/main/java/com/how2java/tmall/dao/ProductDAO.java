package com.how2java.tmall.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{

	public Page<Product> findByCategory(Category category, Pageable pageable);
	public List<Product> findByCategoryOrderById(Category category);
	public List<Product> findByNameLike(String keyword, Pageable pageable);
}