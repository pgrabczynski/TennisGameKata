import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.patryk.Point;
import pl.patryk.TennisGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {
    TennisGame tennisGame;
    @BeforeEach
    void init() {
        tennisGame = new TennisGame();
    }




    @Test
    public void shouldScoreBeZero(){
        TennisGame tennisGame = new TennisGame();

        assertEquals(0, tennisGame.getScore());
    }

    @Test
    public void shouldScoreBeFiftenn(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.getScore().addPoint();
        assertEquals(15,tennisGame.getScore());
    }




}