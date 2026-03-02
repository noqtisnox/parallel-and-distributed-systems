package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.Commission;

@Repository
public class CommissionRepository extends InMemoryRepository<Commission> {
    @Override
    protected Long getId(Commission entity) { return entity.getId(); }

    @Override
    protected void setId(Commission entity, Long id) { entity.setId(id); }
}
