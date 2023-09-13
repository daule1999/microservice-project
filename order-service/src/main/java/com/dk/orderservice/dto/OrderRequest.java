package com.dk.orderservice.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest {
	
	private List<OrderLineItemsDto> orderLineItemsDtoList;

}
