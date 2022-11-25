package br.com.ada.cardgame.model;

import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class Deck {
    List<AbstractPlayingCard> playingCards;

    public Deck(List<AbstractPlayingCard> playingCards) {
        this.playingCards = playingCards;
    }

    public List<AbstractPlayingCard> getPlayingCards() {
        return List.copyOf(playingCards);
    }

    public AbstractPlayingCard getPlayingCard(Integer position) {
        AbstractPlayingCard playingCard = null;
        if (position != null && (position > 0 && position < (playingCards.size() - 1))) {
            playingCard = playingCards.get(position);
        }
        return playingCard;
    }

    public void addPlayingCard(AbstractPlayingCard playingCard) {
        if (playingCard != null) {
            this.playingCards.add(playingCard);
        }
    }

    public void removePlayingCard(AbstractPlayingCard playingCard) {
        if (playingCard != null) {
            this.playingCards.remove(playingCard);
        }
    }
}
