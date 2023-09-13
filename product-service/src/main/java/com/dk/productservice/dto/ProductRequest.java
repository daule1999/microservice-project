package com.dk.productservice.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductRequest {
	private String name;
	private String description;
	private BigDecimal price;
	private Date createdAt;
	private LocalDateTime updatedAt;
}
