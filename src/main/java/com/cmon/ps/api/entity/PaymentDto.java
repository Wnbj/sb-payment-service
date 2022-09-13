package com.cmon.ps.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Payment} entity
 */
@Data
public class PaymentDto implements Serializable {
    private final int paymentId;
    private final String paymentStatus;
    private final String transactionId;
    private final int orderId;
    private final double amount;
}