package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.List;

import lpnu.ua.nox.marketplace.model.enums.OrderStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long buyerId;
    private List<Long> productIds;
    private Double totalAmmount;
    private OrderStatus status;
    private LocalDateTime createdAt;
}
