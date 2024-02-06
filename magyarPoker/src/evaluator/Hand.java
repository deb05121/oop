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

    public Hand() {
    }

    public void setHandEmpty(){
        cards.clear();
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
        if (isPoker()) {
            handValue = HandValue.POKER;
        } else if (isFlush) {
            handValue = HandValue.FLUSH;
        } else if (isAlmostFlush) {
            handValue = HandValue.ALMOSTFLUSH;
        } else {
            handValue = HandValue.NOTHING;
        }
    }

    private boolean isPoker() {
        return cardFrequencies.containsValue(4);
    }

    public void setIsFlush() {
        int counterSZIV = 0;
        int counterTOK = 0;
        int counterZOLD = 0;
        int counterMAKK = 0;


        for (Card card : cards) {
            switch (card.getCardColour()) {
                case SZIV -> {
                    counterSZIV++;
                    if(counterSZIV==4){
                        isAlmostFlush = true;
                    }
                }
                case TOK -> {
                    counterTOK++;
                    if(counterTOK==4){
                        isAlmostFlush = true;
                    }
                }
                case ZOLD -> {
                    counterZOLD++;
                    if(counterZOLD==4){
                        isAlmostFlush = true;
                    }
                }
                case MAKK -> {
                    counterMAKK++;
                    if(counterMAKK==4){
                        isAlmostFlush = true;
                    }
                }
            }
        }
        List<Integer> counters = new ArrayList<>();
        counters.add(counterMAKK);
        counters.add(counterTOK);
        counters.add(counterSZIV);
        counters.add(counterZOLD);

        int n = counters.stream().max(Integer::compare).get();
        if (n == 7) {
            isFlush = true;
            isAlmostFlush = false;
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
