package com.example.android.musicapp;

import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Artist> collaborators = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artist> getCollaborators() {
        return collaborators;
    }

    public void addCollaborator(Artist artist) {
        collaborators.add(artist);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);

        int collaboratorsCounter = collaborators.size();
        while (collaboratorsCounter > 0) {
            sb.append(", ").append(collaborators.get(collaborators.size() - collaboratorsCounter));
            collaboratorsCounter--;
        }

        return sb.toString();
    }
}
