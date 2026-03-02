package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Review;

@Repository
public class ReviewRepository extends InMemoryRepository<Review> {
    @Override
    protected Long getId(Review entity) { return entity.getId(); }

    @Override
    protected void setId(Review entity, Long id) { entity.setId(id); }
}
