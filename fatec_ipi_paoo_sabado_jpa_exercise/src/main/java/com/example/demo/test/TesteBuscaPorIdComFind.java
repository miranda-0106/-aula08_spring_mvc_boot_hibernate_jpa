package com.example.demo.test;

import javax.persistence.EntityManager;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAUtil;

public class TesteBuscaPorIdComFind {

	public static void main(String[] args) {	
		EntityManager manager = JPAUtil.getEntityManager();
		Veiculo v = manager.find (Veiculo.class, 1L);
		System.out.println(v);
		manager.close();
		JPAUtil.close();
	}

}
