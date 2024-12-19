package com.example.anibasoufianecontrole1.services;

import com.example.anibasoufianecontrole1.dao.Commande;
import com.example.anibasoufianecontrole1.repositories.ClientRepository;
import com.example.anibasoufianecontrole1.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandeService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeRepository commandeRepository;

    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    public Commande getCommande(Long id) {
        return commandeRepository.findCommandeById(id);
    }

    public Commande updateCommande(Long id, Commande commande) {
        Commande commandeToUpdate = commandeRepository.findCommandeById(id);
        if (commandeToUpdate == null) {
            return null;
        }
        commandeToUpdate.setClient(commande.getClient());
        commandeToUpdate.setMontantTotal(commande.getMontantTotal());
        commandeToUpdate.setDateCommande(commande.getDateCommande());
        return commandeRepository.save(commandeToUpdate);
    }


    public Commande deleteCommande(Long id) {
        Commande commandeToDelete = commandeRepository.findCommandeById(id);
        if (commandeToDelete == null) {
            return null;
        }
        commandeRepository.delete(commandeToDelete);
        return commandeToDelete;
    }

    public Commande findCommandeById(Long aLong) {
        return commandeRepository.findCommandeById(aLong);
    }

}
