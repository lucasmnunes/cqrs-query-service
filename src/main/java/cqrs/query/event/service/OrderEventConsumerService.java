package cqrs.query.event.service;

import cqrs.query.event.model.OrderCreatedEvent;
import cqrs.query.model.OrderView;
import cqrs.query.service.OrderQueryService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log
public class OrderEventConsumerService {

    private OrderQueryService orderQueryService;

    public void consumeOrderEventAndCreateOrderView(OrderCreatedEvent event) {
        log.warning("Saving Order in Read Database...");

        OrderView orderView = OrderView.builder()
                .id(event.getId())
                .product(event.getProduct())
                .quantity(event.getQuantity())
                .build();

        orderQueryService.createOrderView(orderView);
    }

}
