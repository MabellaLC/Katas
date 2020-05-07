package scoreKeeper;

public class ScoreKeeper {

    int scoreTeamA;
    int scoreTeamB;

    public ScoreKeeper() {
        this.scoreTeamA = 0;
        this.scoreTeamB = 0;
    }

    public void scoreTeamA1() {
        scoreTeamA += 1;
    }

    public void scoreTeamA2() {
        scoreTeamA += 2;
    }

    public void scoreTeamA3() {
        scoreTeamA += 3;
    }

    public void scoreTeamB1() {
        scoreTeamB += 1;
    }

    public void scoreTeamB2() {
        scoreTeamB += 2;
    }

    public void scoreTeamB3() {
        scoreTeamB += 3;
    }

    public String getScore() {

        return String.format("%03d:%03d", scoreTeamA, scoreTeamB);
    }


}
