import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverInitialShould {
    @Test
    public void obtain_same_marsRover_when_move_is_not_correct(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,2, 'N'), marsRover.move(""));
    }

    @Test
    public void obtain_same_marsRover_when_move_is_not_correct_(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,2, 'N'), marsRover.move("*"));
    }

    @Test
    public void moves_forward_when_pointing_north(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,3, 'N'), marsRover.move("f"));
    }

    @Test
    public void moves_backward_when_pointing_north(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,1, 'N'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_north(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,2, 'O'), marsRover.move("l"));
    }

    @Test
    public void moves_right_when_pointing_north(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');

        assertEquals(new MarsRoverInitial(2,2, 'E'), marsRover.move("r"));
    }

    @Test
    public void moves_forward_when_pointing_est(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'E');

        assertEquals(new MarsRoverInitial(3,2, 'E'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_est(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'E');

        assertEquals(new MarsRoverInitial(2,2, 'S'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_est(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'E');

        assertEquals(new MarsRoverInitial(1,2, 'E'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_est(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'E');

        assertEquals(new MarsRoverInitial(2,2, 'N'), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_south(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'S');

        assertEquals(new MarsRoverInitial(2,1, 'S'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_south(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'S');

        assertEquals(new MarsRoverInitial(2,2, 'O'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_south(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'S');

        assertEquals(new MarsRoverInitial(2,3, 'S'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_south(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'S');

        assertEquals(new MarsRoverInitial(2,2, 'E'), marsRover.move("l"));
    }

    @Test
    public void moves_forward_when_pointing_oest(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'O');

        assertEquals(new MarsRoverInitial(1,2, 'O'), marsRover.move("f"));
    }

    @Test
    public void moves_right_when_pointing_oest(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'O');

        assertEquals(new MarsRoverInitial(2,2, 'N'), marsRover.move("r"));
    }

    @Test
    public void moves_backward_when_pointing_oest(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'O');

        assertEquals(new MarsRoverInitial(3,2, 'O'), marsRover.move("b"));
    }

    @Test
    public void moves_left_when_pointing_oest(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'O');

        assertEquals(new MarsRoverInitial(2,2, 'S'), marsRover.move("l"));
    }

    /*@Test
    public void receives_multiple_commands(){
        MarsRoverInitial marsRover = new MarsRoverInitial(2,2,'N');
        assertEquals(new MarsRoverInitial(2,4, 'N'), marsRover.move("ff"));
    }*/
}
