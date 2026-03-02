package lpnu.ua.nox.marketplace.model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private Long id;
    private Long productId;
    private Long authorId;
    private Integer rating;
    private String comment;
}