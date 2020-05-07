package acceptanceTest;

import org.junit.jupiter.api.Test;
import scoreKeeper.ScoreKeeper;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {
    @Test
    public void generate_the_final_result_of_a_game(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        scoreKeeper.scoreTeamA1();
        scoreKeeper.scoreTeamA2();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB1();
        scoreKeeper.scoreTeamB2();
        scoreKeeper.scoreTeamB3();

        String scoreResult = scoreKeeper.getScore();

        assertEquals("006:006", scoreResult);
    }
}
