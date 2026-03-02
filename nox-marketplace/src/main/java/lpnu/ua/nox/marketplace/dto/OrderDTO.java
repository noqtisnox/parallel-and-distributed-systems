package lpnu.ua.nox.marketplace.dto;

import lombok.Data;
import java.util.List;
import jakarta.validation.constraints.NotNull;

@Data
public class OrderDTO {
    private Long id;
    private Long buyerId;

    @NotNull(message = "Order cannot be bull")
    private List<Long> productIds;

    private Double totalAmount;
    private String status;
}
