package com.txn.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_deposit", nullable = false)
    private Boolean isDeposit;

    @Column(nullable = false)
    private Long amount;

    @Column(nullable = false, length = 30)
    private String status;

    @Column(name = "sender_user_id", nullable = false)
    private Long senderUserId;

    @Column(name = "is_interac_txn", nullable = false)
    private Boolean isInteracTxn;

    @Column(name = "receiver_user_id")
    private Long receiverUserId;

    @Column(name = "receriver_bank_details", length = 200)
    private String receiverBankDetails;

    @Column(name = "receiver_location", length = 200)
    private String receiverLocation;

    @Column(name = "createad_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDeposit() {
        return isDeposit;
    }

    public void setIsDeposit(Boolean isDeposit) {
        this.isDeposit = isDeposit;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSenderUserId() {
        return senderUserId;
    }

    public void setSenderUserId(Long senderUserId) {
        this.senderUserId = senderUserId;
    }

    public Boolean getIsInteracTxn() {
        return isInteracTxn;
    }

    public void setIsInteracTxn(Boolean isInteracTxn) {
        this.isInteracTxn = isInteracTxn;
    }

    public Long getReceiverUserId() {
        return receiverUserId;
    }

    public void setReceiverUserId(Long receiverUserId) {
        this.receiverUserId = receiverUserId;
    }

    public String getReceiverBankDetails() {
        return receiverBankDetails;
    }

    public void setReceiverBankDetails(String receiverBankDetails) {
        this.receiverBankDetails = receiverBankDetails;
    }

    public String getReceiverLocation() {
        return receiverLocation;
    }

    public void setReceiverLocation(String receiverLocation) {
        this.receiverLocation = receiverLocation;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
