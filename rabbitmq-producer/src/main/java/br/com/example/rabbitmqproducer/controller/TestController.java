package br.com.example.rabbitmqproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.rabbitmqproducer.dto.MessageDto;
import br.com.example.rabbitmqproducer.dto.SuccessMessageDto;
import br.com.example.rabbitmqproducer.message.QueueSender;

@RestController
@RequestMapping("tests")
public class TestController {

	@Autowired
	private QueueSender queueSender;

	@PostMapping
	public ResponseEntity<SuccessMessageDto> sendMessage(@RequestBody MessageDto messageDto) {
		queueSender.send(messageDto);
		return ResponseEntity.ok(SuccessMessageDto.builder().message("Sended with success").build());
	}

}
