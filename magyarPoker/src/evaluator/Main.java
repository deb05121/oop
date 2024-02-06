package evaluator;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidHandSizeException {
        Hand hand;
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
        Hand hand1;
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
        Hand hand2;
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

    }

}
