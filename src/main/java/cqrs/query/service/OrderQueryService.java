package cqrs.query.service;

import cqrs.query.model.OrderView;
import cqrs.query.repository.OrderViewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderQueryService {

    private OrderViewRepository orderViewRepository;

    public List<OrderView> getAllOrders() {
        return orderViewRepository.findAll();
    }

    public OrderView getOrderById(Long id) {
        return orderViewRepository.findById(id).orElse(null);
    }

    public OrderView createOrderView(OrderView orderView) {
        return orderViewRepository.save(orderView);
    }

}
