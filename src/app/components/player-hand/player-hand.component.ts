import { Component } from '@angular/core';
import { Card } from 'src/app/models/Card';

@Component({
  selector: 'app-player-hand',
  templateUrl: './player-hand.component.html',
  styleUrls: ['./player-hand.component.css']
})
export class PlayerHandComponent {
  hand: Card[] = [
    {value: "1", suit: "clubs", selected: false},
    {value: "2", suit: "hearts", selected: false},
    {value: "3", suit: "diamonds", selected: false},
    {value: "4", suit: "spades", selected: false},
    {value: "5", suit: "clubs", selected: false}
  ];
}
