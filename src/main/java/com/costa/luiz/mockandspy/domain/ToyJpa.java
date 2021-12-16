package com.costa.luiz.mockandspy.domain;

import java.util.List;
import java.util.Optional;

public class ToyJpa implements ToyRepository{
    @Override
    public Toy save(Toy toy) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(Toy toy) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Toy> findById(String id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Toy> findAll() {
        throw new UnsupportedOperationException();
    }
}
