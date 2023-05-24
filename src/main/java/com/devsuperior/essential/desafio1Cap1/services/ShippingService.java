package com.devsuperior.essential.desafio1Cap1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.essential.desafio1Cap1.OrderInvalidException;
import com.devsuperior.essential.desafio1Cap1.entities.Order;

@Service
public class ShippingService {

	public Double shipment(final Order order) {
		if (order == null || order.getBasic() <= 0) {
			throw new OrderInvalidException();
		}
		if (order.getBasic() <= 100D) {
			return 20D;
		} else
		if (order.getBasic() > 100 && order.getBasic() < 200) {
			return 12D;
		} else if (order.getBasic() >= 200) {
			return 0D;
		}
		return null;
	}
}
