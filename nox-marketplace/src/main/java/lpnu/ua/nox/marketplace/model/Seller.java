package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    private Long id;
    private Long userId;
    private String companyName;
    private double rating;
}