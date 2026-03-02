package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import jakarta.validation.constraints.Min;

@Data
public class PaymentDTO {
    private Long id;
    private Long orderId;

    @Min(value = 0, message = "Cannot assign negative values to amount")
    private Double amount;

    private String status;
}
