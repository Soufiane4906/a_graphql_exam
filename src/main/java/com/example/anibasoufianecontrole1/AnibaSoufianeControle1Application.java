package com.example.anibasoufianecontrole1;

import com.example.anibasoufianecontrole1.dao.Client;
import com.example.anibasoufianecontrole1.dao.Commande;
import com.example.anibasoufianecontrole1.repositories.ClientRepository;
import com.example.anibasoufianecontrole1.repositories.CommandeRepository;
import org.antlr.v4.runtime.misc.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class AnibaSoufianeControle1Application  {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CommandeRepository commandeRepository;


    public static void main(String[] args) {
        SpringApplication.run(AnibaSoufianeControle1Application.class, args);


    }

//    @Override
//    public void run(String... args) throws Exception {
//
//        Client client = Client.()
//
//                .nom("Soufiane")
//                .build();
//        //save
//        clientRepository.save(client);
//
//        Client client2 = Client.builder()
//                .nom("Aniba")
//                .build();
//        //save
//        clientRepository.save(client2);
//
//        //commandes
//        Commande commande = new Commande();
//        commande.setClient(client);
//        commande.setMontantTotal(1000.0);
//        commande.setDateCommande(new Date());
//        commandeRepository.save(commande);
//
//        commandeRepository.save(Commande.builder()
//                .client(client2)
//                .montantTotal(2000.0)
//                .dateCommande(new Date())
//                .build());
//    }
}