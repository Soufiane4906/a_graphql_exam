package com.example.anibasoufianecontrole1.dao;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "commandes")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "dateCommande" , nullable = false)
    private Date dateCommande;
    @Column(name = "montantCommande" , nullable = false)
    private Double montantTotal;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;



}
