package evaluator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.ArrayList;
import java.util.List;

public class HandTest {
    static Hand hand = new Hand();
    Card card1 = new Card();
    Card card2 = new Card();
    Card card3 = new Card();
    Card card4 = new Card();
    Card card5 = new Card();
    Card card6 = new Card();
    Card card7 = new Card();

    static List<Card> cardList = new ArrayList<>();

    public HandTest() {
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kez_flush.csv"})
    void csvDataOfFlush(String twoChars1, String twoChars2, String twoChars3, String twoChars4, String twoChars5, String twoChars6, String twoChars7 ) throws InvalidHandSizeException {
        addCardsToCardList(twoChars1, twoChars2, twoChars3, twoChars4, twoChars5, twoChars6, twoChars7);

    }

    static void shouldBeFlush(Hand hand) {
        Assertions.assertEquals(HandValue.FLUSH, hand.getHandValue());
        hand.setHandEmpty();
    }

    private void addCardsToCardList(String twoChars1, String twoChars2, String twoChars3, String twoChars4, String twoChars5, String twoChars6, String twoChars7) throws InvalidHandSizeException {
        card1.setCardColourWithString(twoChars1.substring(0,1));
        card1.setCardValueWithString(twoChars1.substring(1,2));
        addCardToList(card1);
        card2.setCardColourWithString(twoChars2.substring(0,1));
        card2.setCardValueWithString(twoChars2.substring(1,2));
        addCardToList(card2);
        card3.setCardColourWithString(twoChars3.substring(0,1));
        card3.setCardValueWithString(twoChars3.substring(1,2));
        addCardToList(card3);
        card4.setCardColourWithString(twoChars4.substring(0,1));
        card4.setCardValueWithString(twoChars4.substring(1,2));
        addCardToList(card4);
        card5.setCardColourWithString(twoChars5.substring(0,1));
        card5.setCardValueWithString(twoChars5.substring(1,2));
        addCardToList(card5);
        card6.setCardColourWithString(twoChars6.substring(0,1));
        card6.setCardValueWithString(twoChars6.substring(1,2));
        addCardToList(card6);
        card7.setCardColourWithString(twoChars7.substring(0,1));
        card7.setCardValueWithString(twoChars7.substring(1,2));
        addCardToList(card7);
    }

    private static void addCardToList(Card card) throws InvalidHandSizeException {
        cardList.add(card);
        
        if (cardList.size() == 7) {
            hand = new Hand(cardList);
            System.out.println(hand.getHandValue());
            System.out.println(cardList);
            cardList.clear();
            switch (hand.getHandValue()){
                case FLUSH -> shouldBeFlush(hand);
                case POKER -> shouldBePoker(hand);
                case ALMOSTFLUSH -> shouldBeAlmostFlush(hand);
                default -> System.out.println("There isn't such evaluate.");
            }

        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kezpoker.csv"})
    void csvDataOfPoker(String twoChars1, String twoChars2, String twoChars3, String twoChars4, String twoChars5, String twoChars6, String twoChars7 ) throws InvalidHandSizeException {
        addCardsToCardList(twoChars1, twoChars2, twoChars3, twoChars4, twoChars5, twoChars6, twoChars7);
    }
    static void shouldBePoker(Hand hand) {
        Assertions.assertEquals(HandValue.POKER, hand.getHandValue());
        hand.setHandEmpty();
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kezalmost_flush.csv"})
    void csvDataOfAlmostFlush(String twoChars1, String twoChars2, String twoChars3, String twoChars4, String twoChars5, String twoChars6, String twoChars7 ) throws InvalidHandSizeException {
        addCardsToCardList(twoChars1, twoChars2, twoChars3, twoChars4, twoChars5, twoChars6, twoChars7);
    }
    static void shouldBeAlmostFlush(Hand hand) {
        Assertions.assertEquals(HandValue.ALMOSTFLUSH, hand.getHandValue());
        hand.setHandEmpty();
    }

}
