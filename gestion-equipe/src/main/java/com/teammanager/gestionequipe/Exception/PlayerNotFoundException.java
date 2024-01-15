package com.teammanager.gestionequipe.Exception;

public class PlayerNotFoundException extends RuntimeException {

    public PlayerNotFoundException(int id) {
        super("Could not find any player " + id);
    }
}