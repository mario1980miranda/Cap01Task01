package com.devsuperior.essential.desafio1Cap1;

public class OrderInvalidException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OrderInvalidException() {
		super("Invalid Order!");
	}
}
