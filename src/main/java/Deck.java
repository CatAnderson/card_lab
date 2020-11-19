import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int countCards(){
        return this.cards.size();
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public void addAllCardsToDeck(){
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                Card allCards = new Card(suit, rank);
                addCard(allCards);

//                System.out.println(allCards.getRank());
//                System.out.println(allCards.getValueRank());
            }

        }

    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public void dealCard(){
        this.cards.remove(0);
    }
}

