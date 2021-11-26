import {Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-petcomponent',
  templateUrl: './petcomponent.component.html',
  styleUrls: ['./petcomponent.component.css']
})


export class PetcomponentComponent {
  petname: string;
  petage: number;
  petimg: string;

  constructor() {
  }

  Petname(value: Event) {
    // @ts-ignore
    this.petname = value.target.value;
  }

  Petage($events: Event) {
    // @ts-ignore
    this.petage = $events.target.value;
  }

  Petimg($eventss: Event) {
    // @ts-ignore
    this.petimg = $eventss.target.value;
  }
}
