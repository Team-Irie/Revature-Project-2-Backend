package com.gryffindor.repositories;

import java.util.List;
import com.gryffindor.models.User;
import com.gryffindor.models.Reservation;
import com.gryffindor.types.ReservationStatus;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> getReservationsByCustomer(User user);
    List<Reservation> getReservationsByStatus(ReservationStatus reservationStatus);
}