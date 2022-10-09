package com.backend.chain.entity;

import lombok.Data;

@Data
public class History {
    String transactionId;
    String timestamp;
    String accountId;
    double elecAmount;
    double balance;
    Boolean isDeleted;
    String createTime;
    String updateTime;

    public History(String transactionId, String timestamp, String accountId, double elecAmount, double balance, Boolean isDeleted, String createTime, String updateTime) {
        this.transactionId = transactionId;
        this.timestamp = timestamp;
        this.accountId = accountId;
        this.elecAmount = elecAmount;
        this.balance = balance;
        this.isDeleted = isDeleted;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
