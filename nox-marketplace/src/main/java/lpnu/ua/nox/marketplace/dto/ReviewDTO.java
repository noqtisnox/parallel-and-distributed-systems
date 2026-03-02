package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

@Data
public class ReviewDTO {
    private Long id;
    private Long productId;

    @Min(value = 1, message = "Cannot assign rating below 1")
    @Max(value = 5, message = "Cannot assign rating above 5")
    private Integer rating;
    
    private String comment;
}
