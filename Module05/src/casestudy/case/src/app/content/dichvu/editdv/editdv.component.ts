import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-editdv',
  templateUrl: './editdv.component.html',
  styleUrls: ['./editdv.component.css']
})
export class EditdvComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
