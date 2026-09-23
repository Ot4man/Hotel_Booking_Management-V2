package repository;

import model.Reservation;

import java.util.List;
import java.util.UUID;

public interface ReservationRepository {

    void save(Reservation reservation);

    Reservation findById(UUID id);

    List<Reservation> findAll();

    List<Reservation> findByUserId(UUID userId);

    boolean hasOverlappingReservations(String roomNumber, java.time.LocalDate checkIn, java.time.LocalDate checkOut);
}