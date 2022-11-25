package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.player.Player;
import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;
import br.com.ada.cardgame.model.Deck;

public interface IGameBoard {
    void addDeck(Deck deck);
    Boolean canCardBePlayed(Player player, AbstractPlayingCard attackPlayingCard);
    Player hasPlayerWinner();
}
