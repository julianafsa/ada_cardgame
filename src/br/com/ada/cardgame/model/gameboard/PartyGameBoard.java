package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.field.PartyFieldSide;
import br.com.ada.cardgame.model.player.Player;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class PartyGameBoard extends AbstractGameBoard {
//    private final Integer DEFAULT_NUMBER_OF_DECKS = 5;
//    private final Integer DEFAULT_DECK_SIZE = 80;

    public PartyGameBoard(List<Deck> decks, List<Player> players, List<FieldSide> campos) {
        super(5, 80, decks, players, campos);
    }

    public PartyGameBoard(Integer numberOfDecks, Integer deckSize, List<Deck> decks, List<Player> players, List<FieldSide> campos) {
        super(numberOfDecks, deckSize, decks, players, campos);
    }

    void start(List<Deck> decks) {
        Integer deckSize = super.getDeckSize();
        if (decks.size() == deckSize) {
            for (Deck deck : decks) {
                if (deck.getPlayingCards().size() == deckSize) {
                    FieldSide fieldSide = new PartyFieldSide(5,2);
                    Player player = new Player(deck, 10, fieldSide);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Boolean canCardBePlayed(Player player, AbstractPlayingCard attackPlayingCard) {
        return player.getFieldSide().addPlayingCard(attackPlayingCard);
    }

    @Override
    // TODO
    public Boolean isPlayerWinner(Player player) {
        return null;
    }

}
