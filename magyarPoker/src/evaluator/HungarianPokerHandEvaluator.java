package evaluator;

import java.util.Comparator;

public class HungarianPokerHandEvaluator implements Comparator<Card> {

    private static HungarianPokerHandEvaluator INSTANCE;
    private HungarianPokerHandEvaluator(){

    }
    public static HungarianPokerHandEvaluator getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new HungarianPokerHandEvaluator();
        }
        return INSTANCE;
    }

    @Override
    public int compare(Card card1, Card card2) {
        return card1.getCardValue().compareTo(card2.getCardValue());
    }
}
