package evaluator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hand {
    private List<Card> cards;
    private HandValue handValue;
    private boolean isFlush = false;
    private boolean isAlmostFlush = false;
    private Map<CardValue, Integer> cardFrequencies = new HashMap<>();

    public List<Card> getCards() {
        return cards;
    }

    public HandValue getHandValue() {
        return handValue;
    }

    public Map<CardValue, Integer> getCardFrequencies() {
        return cardFrequencies;
    }

    public void setCardFrequencyMap() {
        for (Card card : cards) {
            CardValue cardValue = card.getCardValue();
            if (cardFrequencies.containsKey(cardValue)) {
                cardFrequencies.put(cardValue, cardFrequencies.get(cardValue) + 1);
            } else {
                cardFrequencies.put(cardValue, 1);
            }
        }
    }

    public Hand(List<Card> cards) throws InvalidHandSizeException {
        if (cards.size() != 7) {
            throw new InvalidHandSizeException("Hand size must be 7!");
        }
        this.cards = new ArrayList<>(cards);
        this.cards.sort(HungarianPokerHandEvaluator.getINSTANCE());
        setCardFrequencyMap();
        setIsFlush();
        evaluateHand();
    }

    private void evaluateHand() {
        if(isPoker()){
            handValue = HandValue.POKER;
        }else if(isFlush){
            handValue = HandValue.FLUSH;
        }else if(isAlmostFlush){
            handValue = HandValue.ALMOSTFLUSH;
        }else{
            handValue = HandValue.NOTHING;
        }
    }

    private boolean isPoker() {
        return cardFrequencies.containsValue(4);
    }

    public void setIsFlush() {
        int counter = 0;
        CardColour cardColour = cards.get(0).getCardColour();
        for (Card card : cards) {
            if (card.getCardColour().equals(cardColour)) {
                counter++;
            }
        }
        if (counter >= 7){
            isFlush = true;
        } else if(counter>3){
            isAlmostFlush = true;
        }
    }

    public int getHighestFrequency() {
        return cardFrequencies
                .values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    @Override
    public String toString() {
        return "Hand{" +

                ", handValue=" + handValue +


                ", cardFrequencies=" + cardFrequencies +
                '}';
    }
}
