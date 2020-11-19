import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Card card;
    private Deck deck;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, RankType.KING);
        deck = new Deck();
    }

    @Test
    public void hasNoCards(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void hasOneCardInDeck(){
        deck.addCard(card);
        assertEquals(1, deck.countCards());
    }
}
