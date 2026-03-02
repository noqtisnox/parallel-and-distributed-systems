package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

import lpnu.ua.nox.marketplace.model.enums.PaymentStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private Long orderId;
    private Double amount;
    private PaymentStatus status;
    private LocalDateTime timestamp;
}
