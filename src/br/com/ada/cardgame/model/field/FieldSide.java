package br.com.ada.cardgame.model.field;

import br.com.ada.cardgame.enumerations.PlayingCardType;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class FieldSide {

    private Integer attackCardsLimit;
    private Integer specialAttackCardsLimit;
    private List<AbstractPlayingCard> attackPlayingCards = new ArrayList<>();
    private List<AbstractPlayingCard> specialAttackPlayingCards = new ArrayList<>();

    public FieldSide(Integer attackCardsLimit, Integer specialAttackCardsLimit) {
        this.attackCardsLimit = attackCardsLimit;
        this.specialAttackCardsLimit = specialAttackCardsLimit;
    }

    public Integer getAttackCardsLimit() {
        return attackCardsLimit;
    }

    public void setAttackCardsLimit(Integer attackCardsLimit) {
        this.attackCardsLimit = attackCardsLimit;
    }

    public Integer getSpecialAttackCardsLimit() {
        return specialAttackCardsLimit;
    }

    public void setSpecialAttackCardsLimit(Integer specialAttackCardsLimit) {
        this.specialAttackCardsLimit = specialAttackCardsLimit;
    }

    public List<AbstractPlayingCard> getAttackPlayingCards() {
        return Collections.unmodifiableList(attackPlayingCards);
    }

    public List<AbstractPlayingCard> getSpecialAttackPlayingCards() {
        return Collections.unmodifiableList(specialAttackPlayingCards);
    }

    public abstract Boolean addPlayingCard(AbstractPlayingCard playingCard);

}
