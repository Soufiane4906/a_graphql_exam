package com.example.anibasoufianecontrole1.repositories;

import com.example.anibasoufianecontrole1.dao.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "clients")
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findClientById(Long Id);



}
