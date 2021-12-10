package tn.esprit.spring.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.ProduitService;

import java.util.List;
@RestController
@Api(tags="gestion des produits")
@RequestMapping("/produit")
@Slf4j
@CrossOrigin
public class ProduitRestController {


        @Autowired
        ProduitService produitService;
        @ApiOperation(value="Recuperer les produit")
        @GetMapping("list")
        public List<Produit> retrieveAllProduits(){
            return  produitService.retrieveAllProduits();
        }
        @ApiOperation(value="ajouter un produit")
        @PostMapping("add")
        public Produit addProduit( @RequestBody Produit produit){
            return produitService.addProduit(produit);
        }
        @ApiOperation(value="Recuperer un produit")

        @GetMapping("findById/{id}")
        public Produit retrieveProduit(@PathVariable("id")Long id){
            Produit p =produitService.retrieveProduit(id);
            return p;
        }

        @PutMapping("update/{id]")
        public Produit update(@PathVariable("id")Long id,@RequestBody Produit produit)

        {return produitService.update(id,produit);

        }


    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable("id") Long id ){
            produitService.deleteProduit(id);
    }

    }

