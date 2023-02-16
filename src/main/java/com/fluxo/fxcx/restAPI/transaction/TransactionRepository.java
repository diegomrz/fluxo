package com.fluxo.fxcx.restAPI.transaction;

import java.util.List;

public interface TransactionRepository {
    List<Transaction> findAll();
    Transaction findById(Long id);
    void save(Transaction transaction);
    void update(Transaction transaction);
    void delete(Long id);
}
