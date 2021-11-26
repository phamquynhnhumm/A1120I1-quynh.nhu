import {Component, Input, OnInit} from '@angular/core';
import {KhachHang} from '../../../model/KhachHang';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  @Input()
  khachhangview: KhachHang;
  constructor() { }

  ngOnInit(): void {
    // console.log(this.khachhangview);
  }

}
