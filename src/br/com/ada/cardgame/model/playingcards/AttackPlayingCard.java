package br.com.ada.cardgame.model.playingcards;

import br.com.ada.cardgame.enumerations.PlayingCardType;

public class AttackPlayingCard extends AbstractPlayingCard implements IAttackPlayingCard<Integer> {
    private Integer power;
    private Integer resistance;

    public AttackPlayingCard(String name, PlayingCardType type, Integer cost, Integer power, Integer resistance) {
        super(name, type, cost);
        this.power = power;
        this.resistance = resistance;
    }

    @Override
    public Integer getPower() {
        return power;
    }

    @Override
    public Integer getResistance() {
        return resistance;
    }
}
