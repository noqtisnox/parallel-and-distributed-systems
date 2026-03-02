package lpnu.ua.nox.marketplace.dto;

import lombok.Data;

@Data
public class CommisionDTO {
    private Long id;

    // TODO: Add constaints
    private Double feeAmount;

    // TODO: Add constaints
    private Double sellerPayout;    
}
