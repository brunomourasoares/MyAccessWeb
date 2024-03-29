package com.myaccessweb.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myaccessweb.models.Exit;

public interface ExitRepository extends JpaRepository<Exit, UUID> {
    
    List<Exit> findByDocument(String document);
    Optional<Exit> findByEntranceId(UUID entranceId);
}
