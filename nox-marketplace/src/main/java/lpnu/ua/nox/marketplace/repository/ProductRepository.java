package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Product;

@Repository
public class ProductRepository extends InMemoryRepository<Product> {
    @Override
    protected Long getId(Product entity) { return entity.getId(); }

    @Override
    protected void setId(Product entity, Long id) { entity.setId(id); }
}
