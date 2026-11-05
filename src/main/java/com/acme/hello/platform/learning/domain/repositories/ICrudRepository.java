package com.acme.hello.platform.learning.domain.repositories;

import java.util.Optional;

public interface ICrudRepository <T, ID> {
    T save(T entity);
    Optional<T> findById(ID id);
    boolean existsById(ID id);
    void deleteById(ID id);
}
