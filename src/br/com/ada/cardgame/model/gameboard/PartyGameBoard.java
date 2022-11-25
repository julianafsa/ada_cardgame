package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.player.Player;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class PartyGameBoard extends AbstractGameBoard {
    private final Integer DEFAULT_NUMBER_OF_DECKS = 5;
    private final Integer DEFAULT_DECK_SIZE = 80;
    private final Integer ATTACK_PLAYING_CARDS_LIMIT = 34;

    public PartyGameBoard() {
        super(5, 80);
    }

    public PartyGameBoard(Integer numberOfDecks, Integer deckSize) {
        super(numberOfDecks, deckSize);
    }

    @Override
    public Boolean canCardBePlayed(Player player, AbstractPlayingCard attackPlayingCard) {
        final List<Player> players = super.getPlayers();
        Integer totalAttackPlayingCards = 0;
        for (Player p: players) {
            FieldSide fieldSide = p.getFieldSide();
            final Integer numberAttackPlayingCards = fieldSide.getAttackPlayingCards().size();
            final Integer numberSpecialAttackPlayingCards = fieldSide.getSpecialAttackPlayingCards().size();
            totalAttackPlayingCards += numberAttackPlayingCards + numberSpecialAttackPlayingCards;
        }
        if (totalAttackPlayingCards <= ATTACK_PLAYING_CARDS_LIMIT) {
            player.getFieldSide().addPlayingCard(attackPlayingCard);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;

    }

}
