package sn.esmt.produit.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.produit.service.ProduitService;
import sn.esmt.produit.entity.ProduitEntity;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produit")
@AllArgsConstructor
public class ProduitController {
    private ProduitService produitService;

    @PostMapping
    public ProduitEntity save(ProduitEntity produitEntity){
        return produitService.save(produitEntity);
    }
    @GetMapping
    public List<ProduitEntity> all(){
        return produitService.getAll().get();
    }

    @PutMapping
    public ProduitEntity update(String ref,ProduitEntity produitEntity){
        return produitService.update(ref,produitEntity);
    }

    @DeleteMapping
    public void  delete (String ref){
        produitService.delete(ref);
    }

    @GetMapping("/{ref}") //pour ajouter dans l'url /prenom
    public Optional<ProduitEntity> get(@PathVariable String ref){
       return produitService.get(ref);
    }

}
