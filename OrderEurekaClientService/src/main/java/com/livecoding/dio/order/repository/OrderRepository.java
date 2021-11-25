package com.livecoding.dio.order.repository;

import com.livecoding.dio.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository <Order,Long> {
}
