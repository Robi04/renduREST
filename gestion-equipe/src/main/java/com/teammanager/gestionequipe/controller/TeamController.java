package com.teammanager.gestionequipe.controller;

import com.teammanager.gestionequipe.Exception.PlayerNotFoundException;
import com.teammanager.gestionequipe.Exception.TeamNotFoundException;
import com.teammanager.gestionequipe.model.Player;
import com.teammanager.gestionequipe.model.Team;
import com.teammanager.gestionequipe.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    // Endpoints CRUD (Create, Read, Update, Delete
    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @PostMapping("/teams")
    Team newTeam(@RequestBody Team newTeam) {
        return teamRepository.save(newTeam);
    }

    @GetMapping("/team/{id}")
    Team one(@PathVariable int id) {
        return teamRepository.findById((long)id)
                .orElseThrow(() -> new TeamNotFoundException(id));
    }
}
