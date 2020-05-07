package unitTest;

import org.junit.jupiter.api.Test;
import scoreKeeper.ScoreKeeper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreKeeperTest {
    @Test
    public void show_if_the_format_of_the_score_is_correct(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        String expectedScore = "000:000";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_A_is_one(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        String expectedScore = "001:000";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_A_is_two(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA2();
        String expectedScore = "002:000";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_A_is_three(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        String expectedScore = "003:000";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_B_is_one(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB1();
        String expectedScore = "000:001";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_B_is_two(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB2();
        String expectedScore = "000:002";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }

    @Test
    public void show_result_when_score_team_B_is_three(){
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB3();
        String expectedScore = "000:003";
        String score = scoreKeeper.getScore();
        assertEquals(expectedScore, score);
    }
}
