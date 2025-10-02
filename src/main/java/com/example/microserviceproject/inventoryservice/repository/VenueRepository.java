package com.example.microserviceproject.inventoryservice.repository;

import com.example.microserviceproject.inventoryservice.entity.Venue;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;



@Repository
public interface VenueRepository extends JpaRepository<Venue, Long> {
    Venue findByName(final String name);
}
