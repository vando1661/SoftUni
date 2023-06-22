package Java_OOP._02WorkingWithAbstraction_Exercise.jediGalaxy;

public class Jedi {
    private int row;
    private int col;

    public Jedi(int[] positions) {
        this.row = positions[0];
        this.col = positions[1];
    }

    public int move(StarsField field){
        int starsCollected = 0;
        while (row >= 0 && col < field.getColLength()) {
            if (field.isInBounds(row, col)) {
                starsCollected += field.getValue(row, col);
            }

            col++;
            row--;
        }
        return starsCollected;
    }
}
