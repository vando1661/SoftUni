package Java_OOP._02WorkingWithAbstraction_Exercise;

public class Card {
    private CardSuits cardSuits;
    private CardRanks cardRanks;

    public CardSuits getCardSuits() {
        return cardSuits;
    }

    public CardRanks getCardRanks() {
        return cardRanks;
    }

    public Card(CardSuits cardSuits, CardRanks cardRanks) {
        this.cardSuits = cardSuits;
        this.cardRanks = cardRanks;

    }public int getPower(){
        return cardRanks.getRandPower() + cardSuits.getSuitPower();
    }
}
