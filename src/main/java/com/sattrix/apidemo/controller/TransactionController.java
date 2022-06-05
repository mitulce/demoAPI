package com.sattrix.apidemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sattrix.apidemo.entity.Transaction;
import com.sattrix.apidemo.service.TransactionService;

@RestController
@RequestMapping(value="/admin")

public class TransactionController {
	
	@Autowired TransactionService transactionService;
	
	@GetMapping(value="/transactions")
	public List<Transaction> getTransaction(@RequestParam String status,@RequestParam(required=false,defaultValue="") String type,@RequestParam(required=false,defaultValue="") String currency){
		System.out.println("Inside controller");
		return transactionService.findBy(status, type, currency);
	}
}
