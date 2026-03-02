package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Data
public class ProductDTO {
    private Long id;
    
    @NotBlank(message = "Product name should not be empty")
    private String name;
    
    private String description;
    
    @NotNull(message = "Product price should not be null")
    @Min(value = 0, message = "Product price should be greater than or equal to 0")
    private Double price;
    
    @NotNull(message = "Seller ID should not be null")
    private Long sellerId;
}