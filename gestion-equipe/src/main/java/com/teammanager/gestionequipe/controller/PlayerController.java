package com.teammanager.gestionequipe.controller;

import com.teammanager.gestionequipe.Exception.PlayerNotFoundException;
import com.teammanager.gestionequipe.model.Player;
import com.teammanager.gestionequipe.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    // Endpoints CRUD (Create, Read, Update, Delete)
    @GetMapping("/players")
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @PostMapping("/players")
    Player newEmployee(@RequestBody Player newPlayer) {
        return playerRepository.save(newPlayer);
    }

    @GetMapping("/player/{id}")
    Player one(@PathVariable int id) {

        return playerRepository.findById((long)id)
                .orElseThrow(() -> new PlayerNotFoundException(id));
    }
}
