package org.example.iterator;

public class Player {

    private String nickname;
    private boolean online;

    public Player(String nome, boolean online) {
        this.nickname = nome;
        this.online = online;
    }

    public String getNome() {
        return nickname;
    }

    public void setNome(String nickname) {
        this.nickname = nickname;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

}
