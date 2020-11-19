import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Player1Test {

    private Card card;
    private Deck deck;
    private Player1 player1;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, RankType.KING);
        deck = new Deck();
        player1 = new Player1();
    }

    @Test
    public void hasNoCardsInHand(){
        assertEquals(0, player1.cardCount());
    }

    @Test
    public void hasOneCardInHand(){
        deck.addAllCardsToDeck();
        deck.shuffleCards();
        deck.dealCard();
        player1.addCardToHand();
        assertEquals(1, player1.cardCount());
    }
}
