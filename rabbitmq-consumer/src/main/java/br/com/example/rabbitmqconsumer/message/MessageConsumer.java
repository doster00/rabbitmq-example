package br.com.example.rabbitmqconsumer.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.example.rabbitmqconsumer.dto.MessageDto;

@Component
public class MessageConsumer {

	@RabbitListener(queues = "${consumer.rabbitmq.queue}")
	public void receive(@Payload MessageDto messageDto) {
		System.out.println(messageDto);
	}

}
