package evaluator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import java.io.FileNotFoundException;

import java.util.stream.Stream;

public class HandTest {

    @ParameterizedTest
    @MethodSource(value = "provideFlushHands")
    void shouldBeFlush(Hand hand) {
        Assertions.assertEquals(HandValue.FLUSH, hand.getHandValue());
    }

    static Stream<Hand> provideFlushHands() throws InvalidHandSizeException, FileNotFoundException {

        return Stream.of(
                Main.getKezFromCsv("kez0.csv"),
                Main.getKezFromCsv("kez1.csv"),
                Main.getKezFromCsv("kez2.csv")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "providePokerHands")
    void shouldBePoker(Hand hand) {
        Assertions.assertEquals(HandValue.POKER, hand.getHandValue());
    }

    static Stream<Hand> providePokerHands() throws InvalidHandSizeException, FileNotFoundException {

        return Stream.of(
                Main.getKezFromCsv("kezpoker.csv"),
                Main.getKezFromCsv("kezpoker1.csv"),
                Main.getKezFromCsv("kezpoker2.csv")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "provideAlmostFlushHands")
    void shouldBeAlmostFlush(Hand hand) {
        Assertions.assertEquals(HandValue.ALMOSTFLUSH, hand.getHandValue());
    }

    static Stream<Hand> provideAlmostFlushHands() throws InvalidHandSizeException, FileNotFoundException {

        return Stream.of(
                Main.getKezFromCsv("kezalmostflush.csv"),
                Main.getKezFromCsv("kezalmostflush1.csv"),
                Main.getKezFromCsv("kezalmostflush2.csv")
        );
    }

}
