import { Component, OnInit } from '@angular/core';
import {hopdongDao} from '../../../dao/hopdongDao';

@Component({
  selector: 'app-listhd',
  templateUrl: './listhd.component.html',
  styleUrls: ['./listhd.component.css']
})
export class ListhdComponent implements OnInit {

  hopdongs = hopdongDao;
  constructor() { }

  ngOnInit(): void {
  }

}
