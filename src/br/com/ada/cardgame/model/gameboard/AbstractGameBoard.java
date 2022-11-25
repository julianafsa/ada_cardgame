package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;
import br.com.ada.cardgame.model.field.FieldSide;
import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.player.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGameBoard implements IGameBoard {
    private Integer numberOfDecks;
    private Integer deckSize;
    private List<Deck> decks = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    private List<FieldSide> fieldSides = new ArrayList<>();

    public AbstractGameBoard(Integer numberOfDecks, Integer deckSize, List<Deck> decks, List<Player> players, List<FieldSide> fieldSides) {
        this.numberOfDecks = numberOfDecks;
        this.deckSize = deckSize;
        this.decks = decks;
        this.players = players;
        this.fieldSides = fieldSides;
    }

    public Integer getNumberOfDecks() {
        return numberOfDecks;
    }

    public void setNumberOfDecks(Integer numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public Integer getDeckSize() {
        return deckSize;
    }

    public void setDeckSize(Integer deckSize) {
        this.deckSize = deckSize;
    }

    public List<Deck> getDecks() {
        return decks;
    }

    public void setDecks(List<Deck> decks) {
        this.decks = decks;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<FieldSide> getFieldSides() {
        return fieldSides;
    }

    public void setFieldSides(List<FieldSide> fieldSides) {
        this.fieldSides = fieldSides;
    }

    @Override
    public void addDeck(Deck deck) {
        if (deck != null) {
            decks.add(deck);
        }
    }

    @Override
    public abstract Boolean canCardBePlayed(Player player, AbstractPlayingCard attackPlayingCard);

    @Override
    // TODO
    public Boolean isPlayerWinner(Player player) {
        return null;
    }

    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        }
    }

}
