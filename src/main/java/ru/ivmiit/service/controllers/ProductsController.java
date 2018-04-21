package ru.ivmiit.service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.ivmiit.service.models.Product;
import ru.ivmiit.service.repositories.ProductsRepository;


@Controller
public class ProductsController {
    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("/products")
    public String getProducsPage(ModelMap model) {
        model.addAttribute("productsFromServer", productsRepository.findAll());
        return "products";
    }

    @GetMapping("/{id}/products")
    public String deleteProduct(@PathVariable String id, ModelMap model) {
        Product product = productsRepository.findOne(Long.valueOf(id));
        productsRepository.delete(product);
        model.addAttribute("productsFromServer", productsRepository.findAll());
        return "/products";
    }
}
