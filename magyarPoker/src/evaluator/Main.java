package evaluator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InvalidHandSizeException, FileNotFoundException {
        Hand hand = null;
        hand = new Hand(
                List.of(
                        new Card(CardColour.SZIV, CardValue.ASZ),
                        new Card(CardColour.SZIV, CardValue.KIRALY),
                        new Card(CardColour.SZIV, CardValue.FELSO),
                        new Card(CardColour.SZIV, CardValue.ALSO),
                        new Card(CardColour.SZIV, CardValue.X),
                        new Card(CardColour.SZIV, CardValue.IX),
                        new Card(CardColour.SZIV, CardValue.VII)
                )
        );
        System.out.println(hand);
        Hand hand1 = null;
        hand1 = new Hand(
                List.of(
                        new Card(CardColour.MAKK, CardValue.VII),
                        new Card(CardColour.MAKK, CardValue.VIII),
                        new Card(CardColour.MAKK, CardValue.IX),
                        new Card(CardColour.MAKK, CardValue.X),
                        new Card(CardColour.SZIV, CardValue.VII),
                        new Card(CardColour.ZOLD, CardValue.VII),
                        new Card(CardColour.TOK, CardValue.VII)
                )
        );
        System.out.println(hand1);
        Hand hand2 = null;
        hand2 = new Hand(
                List.of(
                        new Card(CardColour.MAKK, CardValue.VII),
                        new Card(CardColour.MAKK, CardValue.VIII),
                        new Card(CardColour.MAKK, CardValue.IX),
                        new Card(CardColour.MAKK, CardValue.X),
                        new Card(CardColour.SZIV, CardValue.VII),
                        new Card(CardColour.ZOLD, CardValue.VII),
                        new Card(CardColour.TOK, CardValue.VIII)
                )
        );
        System.out.println(hand2);

        Hand kez0 = getKezFromCsv("kez0.csv");
        System.out.println(kez0);
        Hand kezalmostflush = getKezFromCsv("kezalmostflush.csv");
        System.out.println("Should be ALMOSTFLUSH: " + kezalmostflush);


    }

    public static Hand getKezFromCsv(String fileName) throws InvalidHandSizeException, FileNotFoundException {
        CsvParser parser = new CsvParser(new File("C:\\OOP\\oop\\magyarPoker\\csv\\" + fileName), CsvSeparator.COMMA);
        List<List<String>> cardLists = parser.parse();

        List<Card> cardList = new ArrayList<>();
        for (List<String> twoStr : cardLists) {
            Card card = new Card();
            switch (twoStr.get(0)) {
                case "SZIV" -> {
                    card.setCardColour(CardColour.SZIV);
                    ;
                }
                case "ZOLD" -> {
                    card.setCardColour(CardColour.ZOLD);
                }
                case "TOK" -> {
                    card.setCardColour(CardColour.TOK);
                }
                case "MAKK" -> {
                    card.setCardColour(CardColour.MAKK);
                }
            }
            switch (twoStr.get(1)) {
                case "ASZ" -> {
                    card.setCardValue(CardValue.ASZ);
                }
                case "KIRALY" -> {
                    card.setCardValue(CardValue.KIRALY);
                }
                case "FELSO" -> {
                    card.setCardValue(CardValue.FELSO);
                }
                case "ALSO" -> {
                    card.setCardValue(CardValue.ALSO);
                }
                case "X" -> {
                    card.setCardValue(CardValue.X);
                }
                case "IX" -> {
                    card.setCardValue(CardValue.IX);
                }
                case "VIII" -> {
                    card.setCardValue(CardValue.VIII);
                }
                case "VII" -> {
                    card.setCardValue(CardValue.VII);
                }
            }
            cardList.add(card);
        }
        Hand kezTemp = new Hand(cardList);
        return kezTemp;
    }

}
