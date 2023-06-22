package Java_OOP._02WorkingWithAbstraction_Exercise;

public enum CardRanks {
    ACE(14), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
    private int randPower;

    CardRanks(int randPower) {
        this.randPower = randPower;
    }

    public int getRandPower() {
        return randPower;
    }
}
