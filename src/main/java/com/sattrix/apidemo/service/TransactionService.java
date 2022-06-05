package com.sattrix.apidemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sattrix.apidemo.entity.Transaction;
import com.sattrix.apidemo.repository.TransacationRepository;

@Service
public class TransactionService {
	
	@Autowired TransacationRepository transacationRepository;
	
	public List<Transaction> findBy(String status,String type,String currency){
		return transacationRepository.findBy(status, type, currency);
	}
}
