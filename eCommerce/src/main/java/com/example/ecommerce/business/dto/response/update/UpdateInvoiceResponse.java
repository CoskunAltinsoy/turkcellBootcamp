package com.example.ecommerce.business.dto.response.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateInvoiceResponse {
    private int id;
    private int paymentId;
    private int saleId;
}