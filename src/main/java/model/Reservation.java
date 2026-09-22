package model;
import model.enums.ReservationStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Reservation {

    private UUID id;
    private String reservationCode;
    private UUID userId;
    private String roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberOfGuests;
    private int numberOfNights;
    private BigDecimal totalPrice;
    private ReservationStatus status;
    private LocalDateTime createdAt;

    public Reservation() {
    }

    public Reservation(
            UUID id,
            String reservationCode,
            UUID userId,
            String roomNumber,
            LocalDate checkIn,
            LocalDate checkOut,
            int numberOfGuests,
            int numberOfNights,
            BigDecimal totalPrice,
            ReservationStatus status,
            LocalDateTime createdAt) {

        this.id = id;
        this.reservationCode = reservationCode;
        this.userId = userId;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfGuests = numberOfGuests;
        this.numberOfNights = numberOfNights;
        this.totalPrice = totalPrice;
        this.status = status;
        this.createdAt = createdAt;
    }

    public UUID getId() {
        return id;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationCode='" + reservationCode + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", numberOfGuests=" + numberOfGuests +
                ", numberOfNights=" + numberOfNights +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                '}';
    }
}