import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.patryk.TennisGame;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameKataTest {


    @Test
    public void shouldScoreBeZero(){
        TennisGame tennisGame = new TennisGame();

        assertEquals(0, tennisGame.getScore());
    }




}