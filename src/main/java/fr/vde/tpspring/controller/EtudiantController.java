package fr.vde.tpspring.controller;

import fr.vde.tpspring.entities.Etudiant;
import fr.vde.tpspring.service.EtudiantService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "etudiant")
public class EtudiantController {
    private EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void creer(@RequestBody Etudiant etudiant){
        this.etudiantService.creer(etudiant);
    }
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Etudiant> lireAll(){
        return this.etudiantService.lireAll();
    }

}
