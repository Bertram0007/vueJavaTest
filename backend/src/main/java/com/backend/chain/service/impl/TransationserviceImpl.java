package com.backend.chain.service.impl;

import com.backend.chain.entity.Transaction;
import com.backend.chain.dao.TransationDao;
import com.backend.chain.service.TransationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransationserviceImpl  implements TransationService  {
    @Autowired
    private TransationDao transationDao;
    @Override
    public int addTransation(Transaction req) {
        return transationDao.addTransation(req);
    }

    @Override
    public List<Transaction> getAllByUser(String userId) {
        return transationDao.getAllByUser(userId);
    }

    @Override
    public int updateTransaction(int id, int status){
        return transationDao.updateTransaction(id, status);
    }

    @Override
    public int deleteTransaction(int id){
        return transationDao.deleteTransaction(id);
    }

}
