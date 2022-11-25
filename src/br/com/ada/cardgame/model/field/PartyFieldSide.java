package br.com.ada.cardgame.model.field;

import br.com.ada.cardgame.enumerations.PlayingCardType;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.List;

public class PartyFieldSide extends FieldSide {

    public PartyFieldSide(Integer attackCardsLimit, Integer specialAttackCardsLimit) {
        super(attackCardsLimit, specialAttackCardsLimit);
    }

    @Override
    public Boolean addPlayingCard(AbstractPlayingCard playingCard) {
        Boolean result = Boolean.FALSE;
        if (PlayingCardType.ATTACK.equals(playingCard.getType())) {
            List<AbstractPlayingCard> attackPlayingCards =
                    super.getAttackPlayingCards();
            if (attackPlayingCards.size() <= super.getAttackCardsLimit()) {
                attackPlayingCards.add(playingCard);
                result = Boolean.TRUE;
            }
        } else if (PlayingCardType.SPECIAL_ATTACK.equals(playingCard.getType())) {
            List<AbstractPlayingCard> specialAttackPlayingCards =
                    super.getSpecialAttackPlayingCards();
            if (specialAttackPlayingCards.size() < super.getSpecialAttackCardsLimit()) {
                specialAttackPlayingCards.add(playingCard);
                result = Boolean.TRUE;
            }
        }
        return result;
    }
}
