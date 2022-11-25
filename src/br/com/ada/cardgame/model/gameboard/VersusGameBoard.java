package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.enumerations.PlayingCardType;
import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.player.Player;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class VersusGameBoard extends AbstractGameBoard {
    private final Integer DEFAULT_NUMBER_OF_DECKS = 2;
    private final Integer DEFAULT_DECK_SIZE = 50;
    private final Integer LIFE = 100;

    private final Integer attackCardsLimit = 5;
    private final Integer specialAttackCardsLimit = 2;

    public VersusGameBoard() {
        super(2, 50);
    }

    public VersusGameBoard(Integer numberOfDecks, Integer deckSize) {
        super(numberOfDecks, deckSize);
    }

    public Integer getAttackCardsLimit() {
        return attackCardsLimit;
    }

    public Integer getSpecialAttackCardsLimit() {
        return specialAttackCardsLimit;
    }

    @Override
    public Boolean canCardBePlayed(Player player, AbstractPlayingCard attackPlayingCard) {
        Boolean result = Boolean.FALSE;
        final FieldSide fieldSide = player.getFieldSide();
        if (PlayingCardType.ATTACK.equals(attackPlayingCard.getType())) {
            List<AbstractPlayingCard> attackPlayingCards =
                    fieldSide.getAttackPlayingCards();
            if (attackPlayingCards.size() <= getAttackCardsLimit()) {
                player.getFieldSide().addPlayingCard(attackPlayingCard);
                result = Boolean.TRUE;
            }
        } else if (PlayingCardType.SPECIAL_ATTACK.equals(attackPlayingCard.getType())) {
            List<AbstractPlayingCard> specialAttackPlayingCards =
                    fieldSide.getSpecialAttackPlayingCards();
            if (specialAttackPlayingCards.size() < getSpecialAttackCardsLimit()) {
                player.getFieldSide().addPlayingCard(attackPlayingCard);
                result = Boolean.TRUE;
            }
        }
        return result;
    }

}
