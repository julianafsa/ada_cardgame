package br.com.ada.cardgame.enumerations;

public enum PlayingCardType {
    ATTACK("Attack"),
    SPECIAL_ATTACK("SpecialAttack");
    private String name;

    PlayingCardType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
