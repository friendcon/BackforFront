package com.vuebackend.controller

import com.vuebackend.domain.Product
import com.vuebackend.service.ProductService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/product")
class ProductController(
    val productService: ProductService
) {
    @GetMapping("/list")
    fun getList(): List<Product> {
        return productService.getList()
    }
}
