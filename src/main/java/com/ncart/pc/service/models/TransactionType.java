package com.ncart.pc.service.models;

import lombok.Data;

@Data
public class TransactionType {

    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionType() {
    }
}
