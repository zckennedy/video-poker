import { Card } from './../../models/Card';
import { Component } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent {
  card: Card = {value: 1, suit: "hearts"};
  path: string = "../../../assets/suit_images/diamonds.png";
  statusClass: string = "";

  toggleSelect() {
    if (this.statusClass == "") {
      this.statusClass = "selected";
      console.log('toggle')
    } else {
      this.statusClass = "";
    }
  }


}
