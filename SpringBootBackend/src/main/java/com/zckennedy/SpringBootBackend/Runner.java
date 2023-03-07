package com.zckennedy.SpringBootBackend;

import java.util.ArrayList;
import java.util.List;

import com.zckennedy.SpringBootBackend.Model.Card;
import com.zckennedy.SpringBootBackend.Model.Deck;

public class Runner {
  public static void main(String[] args) {
    // List<Card> deck = new ArrayList<>();
    // String[] suits = {"spades","hearts","clubs","diamonds"};
    // for (String suit : suits) {
    //   for (int i = 1 ; i < 14 ; i++) {
    //     deck.add(new Card(i, suit));
    //   }
    // }
    // deck.forEach((card) -> {
    //   System.out.println(card);
    // });

    // System.out.println(deck.size());
    Deck deck = new Deck();
    deck.getCardList().forEach((card) -> {
      System.out.println(card);
    });
    System.out.println(deck.getCardList().size());

    List<Card>drawn=deck.drawCards(3);
    drawn.forEach(card -> {
      System.out.println("DRAWN CARD = " + card);
    });

    deck.getCardList().forEach((card) -> {
      System.out.println(card);
    });
    System.out.println(deck.getCardList().size());

  }
}
