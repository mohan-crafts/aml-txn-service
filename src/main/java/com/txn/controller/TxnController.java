package com.txn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.txn.entity.Transaction;
import com.txn.service.TxnService;

@RestController
@RequestMapping("/transactions")
public class TxnController {
	
	@Autowired TxnService transactionsService;
	
	@GetMapping("")
	public ResponseEntity<List<Transaction>> getTransactions() {
		return ResponseEntity.ok(transactionsService.getAllTransactions());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> getTransaction(@PathVariable("id") Long transactionID) {
		return ResponseEntity.ok(transactionsService.getTransactionById(transactionID));
	}
	
	@PostMapping("")
	public ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
		
		return ResponseEntity.ok(transactionsService.createTransaction(transaction));
	}
	
	@PutMapping("")
	public ResponseEntity<Transaction> updateTransaction(@RequestBody Transaction transaction) {
		
		return ResponseEntity.ok(transactionsService.createTransaction(transaction));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteTransaction(@PathVariable("id") Long transactionId) {
		transactionsService.deleteTransaction(transactionId);
		return ResponseEntity.ok(true);
	}
}