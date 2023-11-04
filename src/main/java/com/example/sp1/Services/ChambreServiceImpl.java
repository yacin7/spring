package com.example.sp1.Services;

import com.example.sp1.Repositories.ChambreRepo;
import com.example.sp1.entities.Chambre;
import com.example.sp1.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    //instance
    ChambreRepo chambreRepo;
    @Override
    public List<Chambre> retrieveAllChambres(){
        return chambreRepo.findAll();
    }
    @Override
    public Chambre addChambre(Chambre c){
        return chambreRepo.save(c);
    }
    @Override
    public Chambre updateChambre(Chambre c){
        return chambreRepo.save(c);
    }
    @Override
    public Chambre retrieveChambre(long idChambre){
        return chambreRepo.findById(idChambre).orElse(null);
    }


    List<Chambre> getChambreByReservationAnneeUniversitaire(Date debut,Date fin){
        List<Chambre> chambres=null;
        for (Chambre c: chambreRepo.findAll())
            for (Reservation r:c.getReservations())
                if (r.getAnneeUniversitaire().after(debut)&& r.getAnneeUniversitaire().before(fin))
                    chambres.add(c);
        return chambres;
    }
}
