package com.example.sp1.RestController;

import com.example.sp1.Repositories.BlocRepo;
import com.example.sp1.Services.IBlocService;
import com.example.sp1.Services.IChambreService;
import com.example.sp1.entities.Bloc;
import com.example.sp1.entities.Chambre;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/bloc")
public class BlocRestController {
        IBlocService iBlocService;
        @GetMapping("/affichertout")
        public List<Bloc> retrieveBlocs(){
            return iBlocService.retrieveBlocs();
        }
        @PostMapping("/ajouterbloc")
        public Bloc addBloc(@RequestBody Bloc bloc){
            return iBlocService.addBloc(bloc);
        }
        @PutMapping("/modifierbloc")
        public Bloc updateBloc(@RequestBody Bloc bloc){

            return iBlocService.updateBloc(bloc);
        }
    @GetMapping("/afficherbloc/{idBloc}")
    public Bloc retrieveBloc(@PathVariable("idBloc") long idBloc) {
        return iBlocService.retrieveBloc(idBloc);
    }

    @DeleteMapping("/supprimerbloc/{idbloc}")
    public void removeBloc(@PathVariable("idbloc") long idBloc) {
        iBlocService.removeBloc(idBloc);
    }

}
