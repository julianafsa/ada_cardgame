package br.com.ada.cardgame.model.playingcards;

import br.com.ada.cardgame.enumerations.PlayingCardType;

public class SpecialAttackPlayingCard extends AttackPlayingCard implements ISpecialAttackPlayingCard {
    private String effect;

    public SpecialAttackPlayingCard(String name, PlayingCardType type, Integer cost, Integer power, Integer resistance) {
        super(name, type, cost, power, resistance);
    }

    @Override
    public void showEffect() {
        System.out.println("See my beautiful effect: " + effect);
    }
}
