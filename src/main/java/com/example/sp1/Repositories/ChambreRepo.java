package com.example.sp1.Repositories;

import com.example.sp1.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
    //recuperer les chambres reservées durant une année universitaire donnée
    //
    //List<Chambre> findChambreByReservations
    // recuperer les chambres definis par leur nom
    List<Chambre> findChambreByBloc_NomBloc(String nom);
}
