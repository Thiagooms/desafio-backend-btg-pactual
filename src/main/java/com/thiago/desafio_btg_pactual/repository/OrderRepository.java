package com.thiago.desafio_btg_pactual.repository;

import com.thiago.desafio_btg_pactual.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
