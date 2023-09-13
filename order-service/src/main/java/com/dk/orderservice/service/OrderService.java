package com.dk.orderservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dk.orderservice.dto.OrderLineItemsDto;
import com.dk.orderservice.dto.OrderRequest;
import com.dk.orderservice.model.Order;
import com.dk.orderservice.model.OrderLineItems;
import com.dk.orderservice.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {
	
	private final OrderRepository orderRepository;

	public void placeOrder(OrderRequest orderRequest) {
		Order order=new Order();
		order.setOrderNo(UUID.randomUUID().toString());
		
		List<OrderLineItems> orderLineItems=orderRequest.getOrderLineItemsDtoList().stream().map(orderLinesDto->mapToDto(orderLinesDto)).toList();
		order.setOrderLineItems(orderLineItems);
		orderRepository.save(order);
	}

	private OrderLineItems mapToDto(OrderLineItemsDto orderLinesDto) {
		OrderLineItems orderLineItems=new OrderLineItems();
		orderLineItems.setPrice(orderLinesDto.getPrice());
		orderLineItems.setQuantity(orderLinesDto.getQuantity());
		orderLineItems.setSkuCode(orderLinesDto.getSkuCode());
		return orderLineItems;
	}
}
