package com.txn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.txn.entity.Transaction;
import com.txn.repo.TxnRepo;

@Service
public class TxnService {
	
	@Autowired TxnRepo txnRepo;
	
	public List<Transaction> getAllTransactions() {
		
		return txnRepo.findAll();
	}
	
	public Transaction getTransactionById(Long id) {
		
		return txnRepo.findById(id).get();
	}
	
	public Transaction createTransaction(Transaction transaction) {
		
		return txnRepo.save(transaction);
	}
	
	public Transaction updateTransaction(Transaction transaction) {
		
		return txnRepo.save(transaction);
	}
	
	public void deleteTransaction(Long transactionId) {
		txnRepo.deleteById(transactionId);
	}
}