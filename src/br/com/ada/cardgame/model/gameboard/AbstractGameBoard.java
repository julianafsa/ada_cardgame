package br.com.ada.cardgame.model.gameboard;

import br.com.ada.cardgame.model.playingcards.AbstractPlayingCard;
import br.com.ada.cardgame.model.Deck;
import br.com.ada.cardgame.model.player.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGameBoard implements IGameBoard {
    private Integer numberOfDecks;
    private Integer deckSize;
    private List<Deck> decks = new ArrayList<>();
    private List<Player> players = new ArrayList<>();
    private final Integer LIFE = 100;

    public AbstractGameBoard(Integer numberOfDecks, Integer deckSize) {
        this.numberOfDecks = numberOfDecks;
        this.deckSize = deckSize;
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

    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        }
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
    public Player hasPlayerWinner() {
        List<Player> livePlayers = new ArrayList<>();
        for (Player player : players) {
            if (player.getLife() > 0) {
                livePlayers.add(player);
            }
        }
        if (livePlayers.size() > 1) {
            return null;
        }
        return livePlayers.get(0);
    }

    void start(List<Deck> decks) {
        if (decks != null) {
            final Integer numberOfDecks = decks.size();
            if (this.numberOfDecks == numberOfDecks) {
                for (Deck deck : decks) {
                    final Integer deckSize = deck.getPlayingCards().size();
                    if (this.deckSize == deckSize) {
                        Player player = new Player(deck, LIFE);
                        addDeck(deck);
                        addPlayer(player);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

}
