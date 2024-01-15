package com.teammanager.gestionequipe.repositories;

import com.teammanager.gestionequipe.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Méthodes personnalisées si nécessaire
}