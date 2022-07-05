package br.com.example.rabbitmqproducer.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;
}
