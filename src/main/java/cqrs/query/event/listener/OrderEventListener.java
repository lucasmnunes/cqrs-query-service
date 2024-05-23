package cqrs.query.event.listener;

import cqrs.query.event.model.OrderCreatedEvent;
import cqrs.query.event.service.OrderEventConsumerService;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderEventListener {

    private OrderEventConsumerService orderEventConsumerService;

    @KafkaListener(topics = "order-events", groupId = "orders_group_id")
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {
        orderEventConsumerService.consumeOrderEventAndCreateOrderView(event);
    }

}
