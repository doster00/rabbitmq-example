package br.com.example.rabbitmqproducer.message;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.example.rabbitmqproducer.dto.MessageDto;

@Component
public class QueueSender {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Value("${producer.rabbitmq.exchange}")
	private String exchange;

	@Value("${producer.rabbitmq.routingkey}")
	private String routingKey;

	public void send(MessageDto messageDto) {
		rabbitTemplate.convertAndSend(exchange, routingKey, messageDto);
	}

}
