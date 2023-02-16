package com.fluxo.fxcx.restAPI.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcTransactionRepository implements TransactionRepository {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcTransactionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Transaction> findAll() {
        return jdbcTemplate.query("SELECT id, category, subcategory, description, inorout, receiver, value  FROM transaction",
                (rs, rowNum) -> new Transaction(
                        rs.getLong("id"),
                        rs.getString("category"),
                        rs.getString("subcategory"),
                        rs.getString("description"),
                        rs.getString("inorout"),
                        rs.getString("receiver"),
                        rs.getLong("value")
                ));
    }
        @Override
    public Transaction findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT id, category, subcategory, description, inorout, receiver, value FROM transaction WHERE id = ?",
                new Object[] { id },
                (rs, rowNum) -> new Transaction(
                        rs.getLong("id"),
                        rs.getString("category"),
                        rs.getString("subcategory"),
                        rs.getString("description"),
                        rs.getString("inorout"),
                        rs.getString("receiver"),
                        rs.getLong("value")
                ));
    }

    @Override
    public void save(Transaction transaction) {
        jdbcTemplate.update("INSERT INTO transaction (id, category, subcategory, description, inorout, receiver, value) VALUES (?, ?, ?, ?, ?, ?, ?)",
            transaction.getId(),
            transaction.getCategory(),
            transaction.getSubcategory(),
            transaction.getDescription(),
            transaction.getInorout(),
            transaction.getReceiver(),
            transaction.getValue()
        );
    }

    @Override
    public void update(Transaction transaction) {
        jdbcTemplate.update("UPDATE transaction SET id = ?, category = ?, subcategory = ?, description = ?, inorout = ?, receiver = ?, value = ? WHERE id = ?",
            transaction.getId(),
            transaction.getCategory(),
            transaction.getSubcategory(),
            transaction.getDescription(),
            transaction.getInorout(),
            transaction.getReceiver(),
            transaction.getValue()
        );
    }

    @Override
    public void delete(Long id) {
        jdbcTemplate.update("DELETE FROM transaction WHERE id = ?", id);
    }
}
