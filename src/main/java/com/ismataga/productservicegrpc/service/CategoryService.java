package com.ismataga.productservicegrpc.service;

import com.ismataga.productservicegrpc.model.Category;
import com.ismataga.productservicegrpc.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public Category add(Category category) {
        return categoryRepository.save(category);
    }
}
