package com.example.anibasoufianecontrole1.controllers;

import com.example.anibasoufianecontrole1.dao.Client;
import com.example.anibasoufianecontrole1.services.ClientService;
import com.example.anibasoufianecontrole1.services.CommandeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SubscriptionMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private CommandeService CommandeService;

    @Autowired
    private ClientService ClientService;

    @QueryMapping()
    public List<Client> getAllClients() {
        return ClientService.getAllClients();
    }



    @QueryMapping()
    public Client getClient(@Argument Long id) {
        return ClientService.getClient(id);
    }
    @MutationMapping()
    public Client addClient(@Argument Client client) {
        Client newClient = new Client(client.getNom());
        return ClientService.addClient(newClient);
    }


    @MutationMapping()
    public Client updateClient(@Argument Long id, @Argument Client Client) {
        return ClientService.updateClient(id, Client);
    }


    @MutationMapping()
    public String deleteClient(@Argument Long id) {
        Client Client = ClientService.deleteClient(id);
        return Client == null ? "Client not found" : "Client deleted";
    }
}