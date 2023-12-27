package com.sagarweb.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sagarweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
