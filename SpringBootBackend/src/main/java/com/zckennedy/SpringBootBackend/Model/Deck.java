package com.zckennedy.SpringBootBackend.Model;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class Deck {
  private List<Card> cardList;

  public Deck() {
    this.cardList = new ArrayList<>();
    this.generateCards();
    this.shuffle();
  }

  private void generateCards() {
    String[] suits = {"spades","hearts","clubs","diamonds"};
    for (String suit : suits) {
      for (int i = 1 ; i < 14 ; i++) {
        cardList.add(new Card(i, suit));
      }
    }
  }

  private void shuffle() {
    Collections.shuffle(cardList);
  }

  public Card drawCard() {
     return cardList.remove(0);
  }

  public List<Card> drawCards(int numCards) {
    List<Card> cardsDrawn = new ArrayList<>();
    for (int i = 0 ; i < numCards ; i++)
      cardsDrawn.add(this.drawCard());
    return cardsDrawn;
  }

  public List<Card> getCardList() {
    return cardList;
  }

  @Override
  public String toString() {
    return "Deck [cardList=" + cardList + "]";
  }
}
