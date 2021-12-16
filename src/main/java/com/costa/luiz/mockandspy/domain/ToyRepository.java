package com.costa.luiz.mockandspy.domain;

import java.util.List;
import java.util.Optional;

public interface ToyRepository {

    Toy save(Toy toy);
    boolean delete(Toy toy);
    boolean delete(String id);
    Optional<Toy> findById(String id);
    List<Toy> findAll();
}
