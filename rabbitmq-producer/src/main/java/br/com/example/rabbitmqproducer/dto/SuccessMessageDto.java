package br.com.example.rabbitmqproducer.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SuccessMessageDto {
	private String message;
	private LocalDateTime createdAt;
}
