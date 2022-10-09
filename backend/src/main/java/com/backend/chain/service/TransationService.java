package com.backend.chain.service;

import com.backend.chain.entity.Transaction;

import java.util.List;

public interface TransationService {
    int addTransation(Transaction req);
    List<Transaction> getAllByUser(String userId);
    int updateTransaction(int id, int status);
    int deleteTransaction(int id);
}
