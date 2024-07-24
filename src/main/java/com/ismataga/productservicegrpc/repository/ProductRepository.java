package com.ismataga.productservicegrpc.repository;

import com.ismataga.productservicegrpc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
