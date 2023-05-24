package com.devsuperior.essential.desafio1Cap1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.essential.desafio1Cap1.entities.Order;
import com.devsuperior.essential.desafio1Cap1.services.OrderService;

@SpringBootApplication
public class Desafio1Cap1Application implements CommandLineRunner {

	private OrderService orderService;

	public Desafio1Cap1Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Cap1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println(String.format("Pedido código %s", order1.getCode()));
		System.out.println(String.format("Valor total: R$ %.2f", this.orderService.total(order1)));
		
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println(String.format("Pedido código %s", order2.getCode()));
		System.out.println(String.format("Valor total: R$ %.2f", this.orderService.total(order2)));
		
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println(String.format("Pedido código %s", order3.getCode()));
		System.out.println(String.format("Valor total: R$ %.2f", this.orderService.total(order3)));
	}

}
