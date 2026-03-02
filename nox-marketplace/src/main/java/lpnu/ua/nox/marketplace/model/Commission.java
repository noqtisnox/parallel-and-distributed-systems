package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commission {
    private Long id;
    private Long orderId;
    private Double feeRate;
    private Double feeAmount;
    private Double sellerPayout;
}