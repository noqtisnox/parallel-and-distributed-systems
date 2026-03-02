package lpnu.ua.nox.marketplace.repository;

import org.springframework.stereotype.Repository;
import lpnu.ua.nox.marketplace.model.User;

@Repository
public class UserRepository extends InMemoryRepository<User> {
    @Override
    protected Long getId(User entity) { return entity.getId(); }

    @Override
    protected void setId(User entity, Long id) { entity.setId(id); }
}
