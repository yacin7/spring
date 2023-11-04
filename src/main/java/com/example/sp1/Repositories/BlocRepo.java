package com.example.sp1.Repositories;

import com.example.sp1.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepo extends JpaRepository<Bloc,Long> {
    Bloc findBlocByNomBloc(String nom);
   // @Query(value = "select b from Bloc b where b.nomBloc=:nom")//JPQL
   // Bloc findBlocByNomBloc(@Param("nom")String nom);


}
