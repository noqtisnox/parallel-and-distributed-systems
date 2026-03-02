package lpnu.ua.nox.marketplace.repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public abstract class InMemoryRepository<T> {
    protected final Map<Long, T> storage = new ConcurrentHashMap<>();
    protected final AtomicLong idGenerator = new AtomicLong();

    protected abstract Long getId(T entity);
    protected abstract void setId(T entity, Long id);

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<T> findById(Long id) {
        return Optional.ofNullable(storage.get(id));
    }

    public T save(T entity) {
        Long id = getId(entity);
        if (id == null) {
            id = idGenerator.incrementAndGet();
            setId(entity, id);
        }
        storage.put(id, entity);
        return entity;
    }

    public void deleteById(Long id) {
        storage.remove(id);
    }
}