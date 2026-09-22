package model;

import model.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {

    private UUID id;
    private UUID reservationId;
    private BigDecimal amount;
    private PaymentStatus status;
    private LocalDateTime paymentDate;

    public Payment() {
    }

    public Payment(
            UUID id,
            UUID reservationId,
            BigDecimal amount,
            PaymentStatus status,
            LocalDateTime paymentDate) {

        this.id = id;
        this.reservationId = reservationId;
        this.amount = amount;
        this.status = status;
        this.paymentDate = paymentDate;
    }

    public UUID getId() {
        return id;
    }

    public UUID getReservationId() {
        return reservationId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}