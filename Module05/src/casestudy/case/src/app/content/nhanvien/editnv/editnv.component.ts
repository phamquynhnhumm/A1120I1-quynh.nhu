import {Component, Input, OnInit} from '@angular/core';
import {NhanVien} from '../../../model/NhanVien';
import {KhachHang} from "../../../model/KhachHang";
import {Router} from "@angular/router";

@Component({
  selector: 'app-editnv',
  templateUrl: './editnv.component.html',
  styleUrls: ['./editnv.component.css']
})
export class EditnvComponent implements OnInit {

  @Input()
  nhanvieneditaa: NhanVien;
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

}
