package br.com.ada.cardgame.model.playingcards;

public interface IAttackPlayingCard<T> {
    T getPower();
    T getResistance();
}
