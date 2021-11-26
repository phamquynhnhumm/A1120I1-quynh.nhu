import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-createhdct',
  templateUrl: './createhdct.component.html',
  styleUrls: ['./createhdct.component.css']
})
export class CreatehdctComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
