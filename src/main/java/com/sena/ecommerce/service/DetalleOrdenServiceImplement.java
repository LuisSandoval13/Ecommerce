package com.sena.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sena.ecommerce.model.DetalleOrden;
import com.sena.ecommerce.repository.IDetalleOrdenRepository;

public class DetalleOrdenServiceImplement implements IDetalleOrdenService {
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleorden) {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.save(detalleorden);
	}

}
