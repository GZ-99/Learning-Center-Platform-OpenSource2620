package com.acme.hello.platform.shared.domain.model.aggregates;

import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AbstractAggregateRoot;

import java.util.Collection;

@NullMarked
public abstract class AbstractDomainAggregateRoot<T extends AbstractAggregateRoot<T>> extends AbstractAggregateRoot<T> {
    @Override
    protected void clearDomainEvents() {
        super.clearDomainEvents();
    }

    @Override
    protected Collection<Object> domainEvents() {
        return super.domainEvents();
    }
}
