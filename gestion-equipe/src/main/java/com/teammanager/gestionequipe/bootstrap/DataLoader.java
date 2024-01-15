package com.teammanager.gestionequipe.bootstrap;

import com.teammanager.gestionequipe.model.Player;
import com.teammanager.gestionequipe.model.Team;
import com.teammanager.gestionequipe.repositories.PlayerRepository;
import com.teammanager.gestionequipe.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final TeamRepository teamRepository;
    private final PlayerRepository playerRepository;

    // Injectez vos repositories et autres composants nécessaires
    @Autowired
    public DataLoader(TeamRepository teamRepository, PlayerRepository playerRepository) {
        this.teamRepository = teamRepository;
        this.playerRepository = playerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Code pour initialiser les données
        // Créer des instances d'Equipe
        Team team1 = new Team(1,"Boston Celtics","Boston");
        Team team2 = new Team(2,"Clevland Cavaliers","Clevland");

        // Sauvegarder les équipes dans la base de données
        teamRepository.save(team1);
        teamRepository.save(team2);

        // Créer des instances de Joueur et les associer à des équipes
        Player player1 = new Player(1,"Jason", "Tatum",27);
        Player player2 = new Player(2,"Lebron", "James",56);

        // Sauvegarder les joueurs dans la base de données
        playerRepository.save(player1);
        playerRepository.save(player2);
    }
}
