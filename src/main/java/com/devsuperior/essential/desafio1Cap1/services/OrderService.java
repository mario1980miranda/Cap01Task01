package com.devsuperior.essential.desafio1Cap1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.essential.desafio1Cap1.OrderInvalidException;
import com.devsuperior.essential.desafio1Cap1.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}



	public Double total(final Order order) {
		if (order == null || order.getBasic() <= 0) {
			throw new OrderInvalidException();
		}
		return order.getBasic() - ((order.getDiscount() / 100) * order.getBasic()) + this.shippingService.shipment(order);
	}
}
