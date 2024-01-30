package evaluator;

public class Card {
    private CardColour cardColour;
    private CardValue cardValue;
    public Card(){

    }

    public Card(CardColour cardColour, CardValue cardValue) {
        this.cardColour = cardColour;
        this.cardValue = cardValue;
    }

    public void setCardColour(CardColour cardColour) {
        this.cardColour = cardColour;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public CardColour getCardColour() {
        return cardColour;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardColour=" + cardColour +
                ", cardValue=" + cardValue +
                '}';
    }
}
