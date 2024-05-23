package cqrs.query.controller;

import cqrs.query.model.OrderView;
import cqrs.query.service.OrderQueryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@AllArgsConstructor
public class OrderQueryController {

    private OrderQueryService orderQueryService;

    @GetMapping
    ResponseEntity<List<OrderView>> getAllOrders() {
        return ResponseEntity.ok(orderQueryService.getAllOrders());
    }

    @GetMapping("/{id}")
    ResponseEntity<OrderView> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderQueryService.getOrderById(id));
    }

}
