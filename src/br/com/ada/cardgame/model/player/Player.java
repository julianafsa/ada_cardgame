package br.com.ada.cardgame.model.player;

import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.Deck;

public class Player {
    private Deck deck;
    private Integer life;
    private FieldSide fieldSide;

    public Player(Deck deck, Integer life, FieldSide fieldSide) {
        this.deck = deck;
        this.life = life;
        this.fieldSide = fieldSide;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public FieldSide getFieldSide() {
        return fieldSide;
    }

    public void setFieldSide(FieldSide fieldSide) {
        this.fieldSide = fieldSide;
    }

    public void receberCura(Integer cura) {
        this.life += cura;
    }

}
