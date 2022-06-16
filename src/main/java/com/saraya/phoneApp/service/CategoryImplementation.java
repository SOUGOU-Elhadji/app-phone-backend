/*package com.saraya.phoneApp.service;

import com.saraya.phoneApp.entity.Category;
import com.saraya.phoneApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "categoryService")
@Scope(value = "singleton")
public class CategoryImplementation implements ICategory{

    @Autowired
    @Qualifier("categoryRepository")
    private CategoryRepository categoryRepository;


    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryByID(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
*/