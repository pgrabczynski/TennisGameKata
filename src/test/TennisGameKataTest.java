import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.patryk.Player;
import pl.patryk.Point;
import pl.patryk.TennisGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {
    TennisGame tennisGame;
    Point point1, point2;
    Player player1, player2;


    @BeforeEach
    void init() {
        point1 = new Point(0);
        point2 = new Point(0);
        player1 = new Player("Roger Federer",point1);
        player2 = new Player("Agnieszka Radwańska",point2);
        tennisGame = new TennisGame(player1, player2);
    }

    @Test
    public void shouldScoreBeZero(){
     tennisGame = new TennisGame(player1, player2);
        String expected = "0 0";

        assertEquals(expected, player1.getPoint() + " " + player2.getPoint());
    }

    @Test
    public void shouldBePlayer1ScoreBeFifteenAndPlayer2BeZero(){
        tennisGame = new TennisGame(player1, player2);
        player1.addPoint();

        String expected = "15 0";

        assertEquals(expected, player1.getPoint() + " " + player2.getPoint());

    }

    @Test
    public void shouldScoreBe0Player1And0Player3(){

    }





}