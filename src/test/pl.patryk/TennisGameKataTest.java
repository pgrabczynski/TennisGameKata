package pl.patryk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisGameKataTest {
    TennisGame tennisGame;

    Player player1, player2;


    @BeforeEach
    void init() {
        tennisGame = new TennisGame(player1, player2);
    }

    @Test
    public void shouldScoreBeZero(){


        player1 = new Player("Roger Federer",0);
        player2 = new Player("Agnieszka Radwańska",0);
        tennisGame = new TennisGame(player1, player2);
        String expected = "0 0";

        assertEquals(expected, player1.getPoint() + " " + player2.getPoint());
    }

    @Test
    public void shouldBePlayer1ScoreBeFifteenAndPlayer2BeZero(){
        tennisGame = new TennisGame(player1, player2);


        player1 = new Player("Roger Federer", 0);
        player2 = new Player("Agnieszka Radwańska", 0);
        player1.addPoint(1);

        String expected = "15 0";

        assertEquals(expected, player1.getPoint()+ " " + player2.getPoint());

    }

    @Test
    public void shouldScoreBe0Player1And0Player3(){

    }





}