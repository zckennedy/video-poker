import { Card } from './../../models/Card';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  //@Input() recievedCard!:Card;
  card: Card = {value: "0", suit: "clubs", selected: false};
  path: string = "../../../assets/suit_images/"+this.card.suit+".png";
  statusClass: string = ""; // used for highlighting cards on hove

  toggleSelect(card: Card) {
    if (this.statusClass == "") {
      card.selected = true;
      this.statusClass = "selected";
      console.log('toggle')
    } else {
      this.statusClass = "";
      card.selected = false;
    }
  }


}
