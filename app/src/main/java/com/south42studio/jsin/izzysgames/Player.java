package com.south42studio.jsin.izzysgames;

public class Player {

    private String playerName;
    private String playerToken;
    private int playerScore;
    private boolean isPlayerTurn;
    private String playerTextScore;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerToken() {
        return playerToken;
    }

    public void setPlayerToken(String playerToken) {
        this.playerToken = playerToken;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public boolean isPlayerTurn() {
        return isPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        isPlayerTurn = playerTurn;
    }

    public String getPlayerTextScore() {
        return playerTextScore;
    }

    public void setPlayerTextScore(String playerTextScore) {
        this.playerTextScore = playerTextScore;
    }







}
