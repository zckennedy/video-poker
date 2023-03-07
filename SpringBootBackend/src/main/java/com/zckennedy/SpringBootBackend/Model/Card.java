package com.zckennedy.SpringBootBackend.Model;

public class Card {
  private int numValue;
  private String strValue;
  private String suit;



  public Card(int numValue, String suit) {
    this.numValue = numValue;
    this.suit = suit;
    if (numValue == 1) {
      this.strValue = "A";
    } else if (numValue <= 10) {
      this.strValue = Integer.toString(numValue);
    } else if (numValue == 11) {
      this.strValue = "J";
    } else if (numValue == 12) {
      this.strValue = "Q";
    } else if (numValue == 13) {
      this.strValue = "K";
    }
  }
  public int getNumValue() {
    return numValue;
  }
  public void setNumValue(int numValue) {
    this.numValue = numValue;
  }
  public String getStrValue() {
    return strValue;
  }

  public String getSuit() {
    return suit;
  }
  public void setSuit(String suit) {
    this.suit = suit;
  }
  @Override
  public String toString() {
    return "Card [numValue=" + numValue + ", strValue=" + strValue + ", suit=" + suit + "]";
  }



}
