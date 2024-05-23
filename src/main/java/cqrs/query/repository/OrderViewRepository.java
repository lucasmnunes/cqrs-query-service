package cqrs.query.repository;

import cqrs.query.model.OrderView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderViewRepository extends JpaRepository<OrderView, Long> {
}