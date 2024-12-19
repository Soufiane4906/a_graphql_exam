package com.example.anibasoufianecontrole1.repositories;

import com.example.anibasoufianecontrole1.dao.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "commandes")
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    //find by id
    public  Commande findCommandeById(Long id);



}
