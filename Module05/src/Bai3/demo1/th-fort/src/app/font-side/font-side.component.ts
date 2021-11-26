import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-font-side',
  templateUrl: './font-side.component.html',
  styleUrls: ['./font-side.component.css']
})
export class FontSideComponent implements OnInit {
  fontSize = 24;

  constructor() {
  }

  setFont(event: Event) {
    // @ts-ignore
   this.fontSize = event.target.value;
  }

  ngOnInit(): void {
  }

}
