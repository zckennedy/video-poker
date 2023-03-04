import { Component } from '@angular/core';
import { Card } from 'src/app/models/Card';

@Component({
  selector: 'app-player-hand',
  templateUrl: './player-hand.component.html',
  styleUrls: ['./player-hand.component.css']
})
export class PlayerHandComponent {
  card: Card = {value: "1", suit: "hearts", selected: false};
}
