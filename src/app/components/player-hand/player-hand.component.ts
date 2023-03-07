import { CardComponent } from './../card/card.component';
import { Card } from './../../models/Card';
import { Component, ViewChild, ViewChildren } from '@angular/core';

@Component({
  selector: 'app-player-hand',
  templateUrl: './player-hand.component.html',
  styleUrls: ['./player-hand.component.css']
})
export class PlayerHandComponent {
  // @ViewChildren(CardComponent) cardComps!:CardComponent[];
  // set CardComponent(hand: CardComponent[]) {
  //   hand.forEach(function (card) {
  //     card.inputCard.value='0';
  //   });
  // }

  // TODO: Added for testing purposes, need to be removed
  push() {
    // this.cardComps.forEach(function(cardComp) {
    //   console.log(cardComp.inputCard)
    // })
    console.log(this.hand)
  }


  hand: Card[] = [
    {value: "1", suit: "clubs", selected: false},
    {value: "2", suit: "hearts", selected: false},
    {value: "3", suit: "diamonds", selected: false},
    {value: "4", suit: "spades", selected: false},
    {value: "5", suit: "clubs", selected: false}
  ];
}
