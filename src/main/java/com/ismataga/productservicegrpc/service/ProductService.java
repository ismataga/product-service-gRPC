package com.ismataga.productservicegrpc.service;

import com.ismataga.productservicegrpc.model.Category;
import com.ismataga.productservicegrpc.model.Product;
import com.ismataga.productservicegrpc.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product add(Product product) {
        return productRepository.save(product);
    }

   public List<Product> getAll() {
        return productRepository.findAll();
   }
}
