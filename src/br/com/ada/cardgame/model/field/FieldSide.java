package br.com.ada.cardgame.model.field;

import br.com.ada.cardgame.enumerations.PlayingCardType;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FieldSide {

    private List<AbstractPlayingCard> attackPlayingCards = new ArrayList<>();
    private List<AbstractPlayingCard> specialAttackPlayingCards = new ArrayList<>();

    public List<AbstractPlayingCard> getAttackPlayingCards() {
        return Collections.unmodifiableList(attackPlayingCards);
    }

    public List<AbstractPlayingCard> getSpecialAttackPlayingCards() {
        return Collections.unmodifiableList(specialAttackPlayingCards);
    }

    public void addAttackPlayingCard(AbstractPlayingCard playingCard) {
        this.attackPlayingCards.add(playingCard);
    }

    public void addSpecialAttackPlayingCard(AbstractPlayingCard playingCard) {
        this.specialAttackPlayingCards.add(playingCard);
    }

    public Boolean addPlayingCard(AbstractPlayingCard playingCard) {
        Boolean result = Boolean.FALSE;
        if (PlayingCardType.ATTACK.equals(playingCard.getType())) {
            addAttackPlayingCard(playingCard);
            result = Boolean.TRUE;
        } else if (PlayingCardType.SPECIAL_ATTACK.equals(playingCard.getType())) {
            addSpecialAttackPlayingCard(playingCard);
            result = Boolean.TRUE;
        }
        return result;
    }

}
