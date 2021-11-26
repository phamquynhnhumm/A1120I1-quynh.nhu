import {Component, Input, OnInit} from '@angular/core';
import {NhanVien} from '../../../model/NhanVien';

@Component({
  selector: 'app-viewnv',
  templateUrl: './viewnv.component.html',
  styleUrls: ['./viewnv.component.css']
})
export class ViewnvComponent implements OnInit {

  @Input()
  nhanvieneviewaa: NhanVien;
  constructor() { }

  ngOnInit(): void {
  }

}
