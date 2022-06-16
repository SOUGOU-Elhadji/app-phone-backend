/*package com.saraya.phoneApp.controller;

import com.saraya.phoneApp.entity.Category;
import com.saraya.phoneApp.service.ICategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("categories")
@Scope("request")
public class CategoryController {

    @Autowired
    @Qualifier("categoryService")
    private ICategory categoryImpl;

    @GetMapping(value = "/category", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Category> fetchAll(){
        return categoryImpl.getAllCategory();
    }

    @PostMapping(value = "/category", consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.CREATED)
    public Category create(@RequestBody Category category){
        return categoryImpl.addCategory(category);
    }

    @GetMapping(value = "/category/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Category getBuId(@PathVariable (value = "id") Long id){
        return categoryImpl.getCategoryById(id);
    }

    @PutMapping(value = "/category",consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public Category update(@RequestBody Category category){
        return categoryImpl.updateCategory(category);
    }

    @DeleteMapping(value = "/category/{id}")
    public ResponseEntity<Category> delete(@PathVariable (value = "id") Long id){
        Category category = categoryImpl.getCategoryById(id);
        categoryImpl.deleteCategoryByID(id);
        return ResponseEntity.ok().build();
    }
}


 */
