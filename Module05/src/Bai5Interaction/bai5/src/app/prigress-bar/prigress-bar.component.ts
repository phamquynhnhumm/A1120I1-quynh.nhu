import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-prigress-bar',
  templateUrl: './prigress-bar.component.html',
  styleUrls: ['./prigress-bar.component.css']
})
export class PrigressBarComponent implements OnInit {

  constructor() { }
  @Input() backgroundColor = '#d9d9d9';
  @Input() progressColor = '#4CAF50';
  @Input() width = 50;
  ngOnInit(): void {
  }
}
