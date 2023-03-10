import { Card } from './../../models/Card';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {
  @Input() inputCard!:Card;
  imgPath:string='';
  statusClass: string = ""; // used for highlighting cards on hove

  ngOnInit(): void {
    this.imgPath = "../../../assets/suit_images/"+this.inputCard.suit+".png";
  }

  toggleSelect(card: Card) {
    if (this.statusClass == "") {
      card.selected = true;
      this.statusClass = "selected";
    } else {
      this.statusClass = "";
      card.selected = false;
    }
  }


}
