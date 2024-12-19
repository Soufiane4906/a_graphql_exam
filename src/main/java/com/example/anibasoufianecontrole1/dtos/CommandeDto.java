package com.example.anibasoufianecontrole1.dtos;

import java.util.Date;

public record CommandeDto(
        Integer id,
        String dateCommande ,
        Double montantTotal,
        Integer client_id


) {   }
