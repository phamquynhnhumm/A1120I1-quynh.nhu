import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  soa: number;
  sob: number;
  pheptinh: '+';
  kq: number;


  constructor() {
  }

  ngOnInit(): void {
  }

  soA(eventss: Event) {

    // @ts-ignore
    console.log(eventss.target.value);
    // @ts-ignore
    this.soa = eventss.target.value;
  }

  soB(events: Event) {
    // @ts-ignore
    console.log(events.target.value);
    // @ts-ignore
    this.sob = events.target.value;

  }

  Pheptinh(event: Event) {
    // @ts-ignore
    this.pheptinh = event.target.value;
  }

  calculate() {
    switch (this.pheptinh) {
      case '+':
        this.kq = +this.soa + +this.sob;
        break;
      case '-':
        this.kq = this.soa - this.sob;
        break;
      case '*':
        this.kq = this.soa * this.sob;
        break;
      case '/':
        this.kq = this.soa / this.sob;
        break;
    }
  }


}
