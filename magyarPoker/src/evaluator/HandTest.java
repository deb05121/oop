package evaluator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.ArrayList;
import java.util.List;

public class HandTest {
    static Hand hand = new Hand();
    Card card = new Card();
    static List<Card> cardList = new ArrayList<>();

    public HandTest() {
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kez.csv", "../test/resources/kez1.csv", "../test/resources/kez2.csv"})
    void csvDataOfFlush(String colour, String value) throws InvalidHandSizeException {
        card.setCardColourWithString(colour);
        card.setCardValueWithString(value);
        addCardToList(card);
    }

    static void shouldBeFlush(Hand hand) {
        Assertions.assertEquals(HandValue.FLUSH, hand.getHandValue());
        hand.setHandEmpty();
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
    @CsvFileSource(resources = {"../test/resources/kezpoker.csv", "../test/resources/kezpoker1.csv", "../test/resources/kezpoker2.csv"})
    void csvDataOfPoker(String colour, String value) throws InvalidHandSizeException {
        card.setCardColourWithString(colour);
        card.setCardValueWithString(value);
        addCardToList(card);
    }
    static void shouldBePoker(Hand hand) {
        Assertions.assertEquals(HandValue.POKER, hand.getHandValue());
        hand.setHandEmpty();
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kezalmostflush.csv", "../test/resources/kezalmostflush.csv", "../test/resources/kezalmostflush.csv"})
    void csvDataOfAlmostFlush(String colour, String value) throws InvalidHandSizeException {
        card.setCardColourWithString(colour);
        card.setCardValueWithString(value);
        addCardToList(card);
    }
    static void shouldBeAlmostFlush(Hand hand) {
        Assertions.assertEquals(HandValue.ALMOSTFLUSH, hand.getHandValue());
        hand.setHandEmpty();
    }

}
