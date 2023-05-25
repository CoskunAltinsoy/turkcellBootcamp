package com.example.ecommerce.business.dto.response.update;

import com.example.ecommerce.business.dto.request.CategoryRequest;
import com.example.ecommerce.entities.concretes.enums.ProductState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductResponse {
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private String description;
    private ProductState productState;
    private List<CategoryRequest> categories;
}
