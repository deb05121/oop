package evaluator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.ArrayList;
import java.util.List;

public class HandTest {
    private static Hand hand = new Hand();
    private Card card1 = new Card();
    private Card card2 = new Card();
    private Card card3 = new Card();
    private Card card4 = new Card();
    private Card card5 = new Card();
    private Card card6 = new Card();
    private Card card7 = new Card();

    static List<Card> cardList = new ArrayList<>();

    public HandTest() {
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kez_flush.csv"})
    void csvDataOfFlush(String nameOfCard1, String nameOfCard2, String nameOfCard3, String nameOfCard4, String nameOfCard5, String nameOfCard6, String nameOfCard7 ) throws InvalidHandSizeException {
        addCardsToCardList(nameOfCard1, nameOfCard2, nameOfCard3, nameOfCard4, nameOfCard5, nameOfCard6, nameOfCard7);

    }

    static void shouldBeFlush(Hand hand) {
        Assertions.assertEquals(HandValue.FLUSH, hand.getHandValue());
        hand.setHandEmpty();
    }

    private void addCardsToCardList(String nameOfCard1, String nameOfCard2, String nameOfCard3, String nameOfCard4, String nameOfCard5, String nameOfCard6, String nameOfCard7) throws InvalidHandSizeException {
        card1.setCardColourWithString(nameOfCard1.substring(0,1));
        card1.setCardValueWithString(nameOfCard1.substring(1,2));
        addCardToList(card1);
        card2.setCardColourWithString(nameOfCard2.substring(0,1));
        card2.setCardValueWithString(nameOfCard2.substring(1,2));
        addCardToList(card2);
        card3.setCardColourWithString(nameOfCard3.substring(0,1));
        card3.setCardValueWithString(nameOfCard3.substring(1,2));
        addCardToList(card3);
        card4.setCardColourWithString(nameOfCard4.substring(0,1));
        card4.setCardValueWithString(nameOfCard4.substring(1,2));
        addCardToList(card4);
        card5.setCardColourWithString(nameOfCard5.substring(0,1));
        card5.setCardValueWithString(nameOfCard5.substring(1,2));
        addCardToList(card5);
        card6.setCardColourWithString(nameOfCard6.substring(0,1));
        card6.setCardValueWithString(nameOfCard6.substring(1,2));
        addCardToList(card6);
        card7.setCardColourWithString(nameOfCard7.substring(0,1));
        card7.setCardValueWithString(nameOfCard7.substring(1,2));
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
    void csvDataOfPoker(String nameOfCard1, String nameOfCard2, String nameOfCard3, String nameOfCard4, String nameOfCard5, String nameOfCard6, String nameOfCard7 ) throws InvalidHandSizeException {
        addCardsToCardList(nameOfCard1, nameOfCard2, nameOfCard3, nameOfCard4, nameOfCard5, nameOfCard6, nameOfCard7);
    }
    static void shouldBePoker(Hand hand) {
        Assertions.assertEquals(HandValue.POKER, hand.getHandValue());
        hand.setHandEmpty();
    }


    @ParameterizedTest
    @CsvFileSource(resources = {"../test/resources/kezalmost_flush.csv"})
    void csvDataOfAlmostFlush(String nameOfCard1, String nameOfCard2, String nameOfCard3, String nameOfCard4, String nameOfCard5, String nameOfCard6, String nameOfCard7 ) throws InvalidHandSizeException {
        addCardsToCardList(nameOfCard1, nameOfCard2, nameOfCard3, nameOfCard4, nameOfCard5, nameOfCard6, nameOfCard7);
    }
    static void shouldBeAlmostFlush(Hand hand) {
        Assertions.assertEquals(HandValue.ALMOSTFLUSH, hand.getHandValue());
        hand.setHandEmpty();
    }



}
