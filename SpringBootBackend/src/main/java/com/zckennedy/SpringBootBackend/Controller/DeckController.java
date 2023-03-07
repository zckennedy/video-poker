package com.zckennedy.SpringBootBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zckennedy.SpringBootBackend.Model.Card;
import com.zckennedy.SpringBootBackend.Model.Deck;

@RestController
@RequestMapping("/api/deck")
@CrossOrigin(origins = "http://localhost:4200")
public class DeckController {

  private Deck deck;

  @GetMapping("/reset")
  public void initDeck() {
    deck = new Deck();
    System.out.println("INIT DECK");
  }

  @GetMapping("/draw")
  public Card drawCard() {
    System.out.println("DRAW FROM DECK");
    return deck.drawCard();
  }

  @GetMapping("/draw/{numCards}")
  public Object[] drawCards(@PathVariable(value = "numCards") int numCards) {
    return deck.drawCards(numCards).toArray();
  }

  // for testing
  @GetMapping("/all")
  public Object[] getDeck() {
    System.out.println("GETTING ALL CARDS");
    return deck.getCardList().toArray();
  }
}
