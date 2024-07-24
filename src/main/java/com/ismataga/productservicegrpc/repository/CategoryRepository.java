package com.ismataga.productservicegrpc.repository;

import com.ismataga.productservicegrpc.model.Category;
import com.ismataga.productservicegrpc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
