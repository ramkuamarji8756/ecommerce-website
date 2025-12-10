package com.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    
    private Long id;
    
    @NotEmpty(message = "Order items cannot be empty")
    @Valid
    private List<OrderItemDTO> items;
    
    @NotBlank(message = "Shipping address is required")
    private String shippingAddress;
    
    private String notes;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class OrderItemDTO {
    
    private Long itemId;
    
    private Integer quantity;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class OrderResponseDTO {
    
    private Long id;
    private UserDTO user;
    private BigDecimal totalAmount;
    private BigDecimal taxAmount;
    private BigDecimal finalAmount;
    private String status;
    private String shippingAddress;
    private String notes;
    private List<OrderItemResponseDTO> items;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class OrderItemResponseDTO {
    
    private Long id;
    private ItemResponseDTO item;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal tax;
    private BigDecimal subtotal;
}
