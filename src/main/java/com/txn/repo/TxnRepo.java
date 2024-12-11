package com.txn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.txn.entity.Transaction;

public interface TxnRepo extends JpaRepository<Transaction, Long> {
		
}