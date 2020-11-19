import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card playingCard;

    @Before
    public void before(){
        playingCard = new Card(SuitType.DIAMONDS, RankType.KING);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.DIAMONDS, playingCard.getSuit());
    }
    
    @Test
    public void canGetRank(){
        assertEquals(RankType.KING, playingCard.getRank());
    }

    @Test
    public void cardHasValue(){
        assertEquals(10, playingCard.getValueRank());
    }
}
