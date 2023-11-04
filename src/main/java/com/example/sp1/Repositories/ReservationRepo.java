package com.example.sp1.Repositories;

import com.example.sp1.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation,String> {
    //chercher les reservations effectuées durant l'année universitaire 23-23
    List<Reservation> findReservationsByAnneeUniversitaireBetween(Date debut, Date fin);
    long countReservationsByAnneeUniversitaireBetween(Date debut, Date fin);

}
