import { Component, OnInit } from '@angular/core';
import {nhanvienDao} from '../../../dao/nhanvienDao';
import {NhanVien} from '../../../model/NhanVien';

@Component({
  selector: 'app-listnv',
  templateUrl: './listnv.component.html',
  styleUrls: ['./listnv.component.css']
})
export class ListnvComponent implements OnInit {
  nhanviens = nhanvienDao;
  nhanvientedit: NhanVien;
  nhanvieneviewaa: NhanVien;
  constructor() { }

  ngOnInit(): void {
  }

  // nhanvieneidt(nhanvien: NhanVien) {
  //   this.nhanviens = nhanvien;
  // }
  nhanvieneidt(nhanvieneidt: NhanVien) {
    // @ts-ignore
    this.nhanvientedit = nhanvieneidt;
  }
}
