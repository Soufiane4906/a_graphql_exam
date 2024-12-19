package com.example.anibasoufianecontrole1.controllers;

import com.example.anibasoufianecontrole1.dao.Client;
import com.example.anibasoufianecontrole1.dao.Commande;
import com.example.anibasoufianecontrole1.services.ClientService;
import com.example.anibasoufianecontrole1.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CommandeController {
    @Autowired
    private ClientService clientService;

    @Autowired
    private CommandeService commandeService;




    //update Commande
    @MutationMapping()
    public Commande updateCommande(@Argument Long id, @Argument Commande commande) {

        return commandeService.updateCommande(id, commande);

    }

    @QueryMapping()
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @QueryMapping()
    public Client getClient(@Argument Long id) {
        return clientService.getClient(id);
    }


    @MutationMapping()
    public Client updateClient(@Argument Long id, @Argument Client clientDto) {
        Client client = new Client(clientDto.getNom());
        return clientService.updateClient(id, client);
    }

    @MutationMapping()
    public Client deleteClient(@Argument Long id) {
        return clientService.deleteClient(id);
    }




    @QueryMapping()
    public Client findClientById(@Argument Long id) {
        return clientService.findClientById(id);
    }
}