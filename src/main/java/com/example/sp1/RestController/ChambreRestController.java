package com.example.sp1.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.sp1.entities.Chambre;
import com.example.sp1.Services.IChambreService;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/chambre")
public class ChambreRestController {
    IChambreService iChambreService;
    @GetMapping("/affichertout")
    public List<Chambre> retrieveAllChambres(){
        return iChambreService.retrieveAllChambres();
    }
    @PostMapping("/ajouterchambre")
    public Chambre addChambre(@RequestBody Chambre c){
        return iChambreService.addChambre(c);
    }
    @PutMapping("/modifierchambre")
    public Chambre updateChambre(@RequestBody Chambre c){

        return iChambreService.updateChambre(c);
    }
    @GetMapping("/afficherchambre/{idchambre}")
    public Chambre retrieveChambre(@PathVariable("idchambre") long idChambre){
        return iChambreService.retrieveChambre(idChambre);
    }
}
