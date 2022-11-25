package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.field.PartyFieldSide;
import br.com.ada.cardgame.model.player.Player;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class VersusGameBoard extends AbstractGameBoard {
//    private final Integer DEFAULT_NUMBER_OF_DECKS = 2;
//    private final Integer DEFAULT_DECK_SIZE = 50;

    public VersusGameBoard(List<Deck> decks, List<Player> players, List<FieldSide> campos) {
        super(2, 50, decks, players, campos);
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
