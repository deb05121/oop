package evaluator;

public class Card {
    private CardColour cardColour;
    private CardValue cardValue;

    public Card() {

    }

    public Card(CardColour cardColour, CardValue cardValue) {
        this.cardColour = cardColour;
        this.cardValue = cardValue;
    }

    public void setCardColour(CardColour cardColour) {
        this.cardColour = cardColour;
    }

    public void setCardColourWithString(String name) {
        switch (name) {
            case "S" -> this.setCardColour(CardColour.SZIV);
            case "Z" -> this.setCardColour(CardColour.ZOLD);
            case "T" -> this.setCardColour(CardColour.TOK);
            case "M" -> this.setCardColour(CardColour.MAKK);
        }
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public void setCardValueWithString(String name) {
        switch (name) {
            case "Á" -> this.setCardValue(CardValue.ASZ);
            case "K" -> this.setCardValue(CardValue.KIRALY);
            case "F" -> this.setCardValue(CardValue.FELSO);
            case "A" -> this.setCardValue(CardValue.ALSO);
            case "X" -> this.setCardValue(CardValue.X);
            case "9" -> this.setCardValue(CardValue.IX);
            case "8" -> this.setCardValue(CardValue.VIII);
            case "7" -> this.setCardValue(CardValue.VII);
        }
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
