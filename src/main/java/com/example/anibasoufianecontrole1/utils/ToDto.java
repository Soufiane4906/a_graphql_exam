//package com.example.anibasoufianecontrole1.utils;
//
//
//import com.example.anibasoufianecontrole1.dao.Client;
//import com.example.anibasoufianecontrole1.dao.Commande;
//import com.example.anibasoufianecontrole1.dtos.ClientDto;
//import com.example.anibasoufianecontrole1.dtos.CommandeDto;
//
//public class ToDto {
//    public static CommandeDto commandeToDto(Commande etudiant) {
//        return new CommandeDto(Math.toIntExact(etudiant.getId()), etudiant.getDateCommande().toString(), etudiant.getMontantTotal(), Math.toIntExact(etudiant.getClient().getId()));
//    }
//
//    public static ClientDto centreToDto(Client centre) {
//        return new ClientDto(centre.getNom());
//    }
//}
