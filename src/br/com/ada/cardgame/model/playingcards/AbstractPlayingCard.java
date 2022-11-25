package br.com.ada.cardgame.model.playingcards;

import br.com.ada.cardgame.enumerations.PlayingCardType;

public class AbstractPlayingCard {
    private String name;
    private PlayingCardType type;
    private Integer cost;

    public AbstractPlayingCard(String name, PlayingCardType type, Integer cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayingCardType getType() {
        return type;
    }

    public void setType(PlayingCardType type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
