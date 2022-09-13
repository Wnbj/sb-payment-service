package com.cmon.ps.api.service;

import com.cmon.ps.api.entity.Payment;
import com.cmon.ps.api.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment createPayment(Payment payment) {
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    private String paymentProcessing() {
        return new Random().nextBoolean() ? "success" : "failed";
    }
}
