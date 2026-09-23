package repository;

import model.Payment;

import java.util.List;
import java.util.UUID;

public interface PaymentRepository {

    void save(Payment payment);

    Payment findById(UUID id);

    Payment findByReservationId(UUID reservationId);

    List<Payment> findAll();
}