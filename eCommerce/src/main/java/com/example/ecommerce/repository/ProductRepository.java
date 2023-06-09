package com.example.ecommerce.repository;

import com.example.ecommerce.entities.concretes.Product;
import com.example.ecommerce.entities.concretes.enums.ProductState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findAllByProductStateIsNot(ProductState productState);


}
