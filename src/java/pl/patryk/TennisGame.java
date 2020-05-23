package pl.patryk;


public class TennisGame {
    private Player player1, player2;

    public TennisGame(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
    }

    public String score(){

        return player1.getPoint() +" "+ player2.getPoint();
    }




}
