package MarsRover;

public class Movement {
    private int displacement;

    public Movement(int displacement) {

        this.displacement = displacement;
    }

    public Vector apply (Vector vector){
        return vector.move(displacement);
    }
}
