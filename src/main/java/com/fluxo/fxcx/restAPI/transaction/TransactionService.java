package com.fluxo.fxcx.restAPI.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> findAllCustomers() {
        return transactionRepository.findAll();
    }

    public Transaction findCustomerById(Long id) {
        return transactionRepository.findById(id);
    }

    public void createCustomer(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public void updateCustomer(Transaction transaction) {
        transactionRepository.update(transaction);
    }
}
