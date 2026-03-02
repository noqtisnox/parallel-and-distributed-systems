package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Data
public class SellerDTO {
    private Long id;

    @NotBlank(message = "Company name should not be empty")
    private String companyName;

    @Min(value = 0, message = "Cannot assign rating below 0.0")
    @Max(value = 5, message = "Cannot assign rating above 5.0")
    private Double rating;
}
