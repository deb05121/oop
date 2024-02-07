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
            case "SZIV" -> this.setCardColour(CardColour.SZIV);
            case "ZOLD" -> this.setCardColour(CardColour.ZOLD);
            case "TOK" -> this.setCardColour(CardColour.TOK);
            case "MAKK" -> this.setCardColour(CardColour.MAKK);
        }
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public void setCardValueWithString(String name) {
        switch (name) {
            case "ASZ" -> this.setCardValue(CardValue.ASZ);
            case "KIRALY" -> this.setCardValue(CardValue.KIRALY);
            case "FELSO" -> this.setCardValue(CardValue.FELSO);
            case "ALSO" -> this.setCardValue(CardValue.ALSO);
            case "X" -> this.setCardValue(CardValue.X);
            case "IX" -> this.setCardValue(CardValue.IX);
            case "VIII" -> this.setCardValue(CardValue.VIII);
            case "VII" -> this.setCardValue(CardValue.VII);
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
