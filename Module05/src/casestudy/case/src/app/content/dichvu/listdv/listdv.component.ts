import {Component, OnInit} from '@angular/core';
import {dichvuDao} from '../../../dao/dichvuDao';
import {nhanvienDao} from '../../../dao/nhanvienDao';

@Component({
  selector: 'app-listdv',
  templateUrl: './listdv.component.html',
  styleUrls: ['./listdv.component.css']
})
export class ListdvComponent implements OnInit {
  dichvus = dichvuDao;
  nhanviens = nhanvienDao;

  constructor() {
  }

  ngOnInit(): void {
  }

}
