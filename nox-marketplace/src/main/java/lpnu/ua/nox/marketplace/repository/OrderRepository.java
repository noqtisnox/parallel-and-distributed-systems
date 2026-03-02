package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Order;

@Repository
public class OrderRepository extends InMemoryRepository<Order> {
    @Override
    protected Long getId(Order entity) { return entity.getId(); }

    @Override
    protected void setId(Order entity, Long id) { entity.setId(id); }
}
