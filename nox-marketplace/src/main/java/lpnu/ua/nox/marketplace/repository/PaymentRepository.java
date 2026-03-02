package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Payment;

@Repository
public class PaymentRepository extends InMemoryRepository<Payment> {
    @Override
    protected Long getId(Payment entity) { return entity.getId(); }

    @Override
    protected void setId(Payment entity, Long id) { entity.setId(id); }
}
