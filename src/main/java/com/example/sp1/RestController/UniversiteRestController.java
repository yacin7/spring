package com.example.sp1.RestController;

import com.example.sp1.Services.IChambreService;
import com.example.sp1.Services.IUniversiteService;
import com.example.sp1.entities.Chambre;
import com.example.sp1.entities.Universite;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/universite")
public class UniversiteRestController {


        IUniversiteService iUniversiteService;
        @GetMapping("/affichertout")
        public List<Universite> retrieveAllUniversities(){
            return iUniversiteService.retrieveAllUniversities();
        }
        @PostMapping("/ajouteruniversite")
        public Universite addUniversity(@RequestBody Universite u){
            return iUniversiteService.addUniversity(u);
        }
        @PutMapping("/modifieruniversite")
        public Universite updateUniversity(@RequestBody Universite u){

            return iUniversiteService.updateUniversity(u);
        }
        @GetMapping("/afficheruniversite/{iduniversite}")
        public Universite retrieveUniversity(@PathVariable("iduniversite") long idUniversite){
            return iUniversiteService.retrieveUniversity(idUniversite);
        }
    }

