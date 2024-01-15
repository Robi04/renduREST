package com.teammanager.gestionequipe.Exception;

public class TeamNotFoundException extends RuntimeException {

    public TeamNotFoundException(int id) {
        super("Could not find any team " + id);
    }
}