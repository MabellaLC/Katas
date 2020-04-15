import Domain.*;
import Exceptions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeShould {
    TicTacToeApp ticTacToeApp;

    @BeforeEach
    public void setUp(){
        ticTacToeApp = new TicTacToeApp();
    }


    @Test
    public void raise_error_when_I_do_not_introduce_any_character(){
        assertThrows(PlayerNotValid.class, () -> ticTacToeApp.play(' ', 0,0) );
    }

    @Test
    public void raise_error_when_I_introduce_a_negative_position(){
        assertThrows(positionNegative.class, () -> ticTacToeApp.play('x', 0,-1) );
    }

    @Test
    public void raise_error_when_I_introduce_a_incorrect_position(){
        assertThrows(OutOfBoard.class, () -> ticTacToeApp.play('x', 4,3) );
    }

    @Test
    public void raise_error_when_I_introduce_a_movement_and_place_is_not_empty(){
        ticTacToeApp.play('x',0,0);
        assertThrows(PositionInBoardIsNotEmpty.class, () -> ticTacToeApp.play('y', 0,0) );
    }

    @Test
    public void raise_error_when_a_token_plays_two_times(){
        ticTacToeApp.play('x',0,0);
        assertThrows(PlayerNotValid.class, () -> ticTacToeApp.play('x',1,2));
    }

    @Test
    public void check_player_X_win_in_top_row(){
        ticTacToeApp.play('x',0,0);
        ticTacToeApp.play('o',1,0);
        ticTacToeApp.play('x',0,1);
        ticTacToeApp.play('o',2,1);
        ticTacToeApp.play('x',0,2);

        char winner = ticTacToeApp.winner();

        assertEquals('x', winner );
    }

    @Test
    public void check_player_o_win_in_third_row(){
        ticTacToeApp.play('x',0,0);
        ticTacToeApp.play('o',2,0);
        ticTacToeApp.play('x',1,1);
        ticTacToeApp.play('o',2,1);
        ticTacToeApp.play('x',0,2);
        ticTacToeApp.play('o',2,2);

        char winner = ticTacToeApp.winner();

        assertEquals('o', winner );
    }


}
