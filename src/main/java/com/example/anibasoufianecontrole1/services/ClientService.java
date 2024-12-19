package com.example.anibasoufianecontrole1.services;

import com.example.anibasoufianecontrole1.dao.Client;
import com.example.anibasoufianecontrole1.repositories.ClientRepository;
import com.example.anibasoufianecontrole1.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeRepository commandeRepository;





    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClient(Long id) {
        return clientRepository.findClientById(id);
    }
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(Long id, Client client) {
        Client clientToUpdate = clientRepository.findClientById(id);
        if (clientToUpdate == null) {
            return null;
        }
        clientToUpdate.setNom(client.getNom());
        return clientRepository.save(clientToUpdate);
    }

    public Client deleteClient(Long id) {
        Client clientToDelete = clientRepository.findClientById(id);
        if (clientToDelete == null) {
            return null;
        }
        clientRepository.delete(clientToDelete);
        return clientToDelete;
    }

    public Client findClientById(Long aLong) {
        return clientRepository.findClientById(aLong);
    }

}
