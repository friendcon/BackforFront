package com.vuebackend.service

import com.vuebackend.domain.Product
import com.vuebackend.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(
    val productRepository: ProductRepository
) {
    fun getList(): List<Product> {
        return productRepository.findAll()
    }
}