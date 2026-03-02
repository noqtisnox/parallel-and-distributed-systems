package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Seller;

@Repository
public class SellerRepository extends InMemoryRepository<Seller> {
    @Override
    protected Long getId(Seller entity) { return entity.getId(); }

    @Override
    protected void setId(Seller entity, Long id) { entity.setId(id); }
}
