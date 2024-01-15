package com.teammanager.gestionequipe.repositories;

import com.teammanager.gestionequipe.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
    // Méthodes personnalisées si nécessaire

}