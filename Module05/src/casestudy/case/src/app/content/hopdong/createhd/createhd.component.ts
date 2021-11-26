import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {FormControl, FormGroup} from "@angular/forms";
import {hopdongDao} from "../../../dao/hopdongDao";

@Component({
  selector: 'app-createhd',
  templateUrl: './createhd.component.html',
  styleUrls: ['./createhd.component.css']
})
export class CreatehdComponent implements OnInit {

  hopdongcreate: FormGroup;

  constructor(private router: Router) {
  }

  ngOnInit(): void {
    this.hopdongcreate = new FormGroup({
      idHD: new FormControl(''),
      nhanVien: new FormControl(''),
      khachHang: new FormControl(''),
      dichVu: new FormControl(''),
      ngayLamHD: new FormControl(''),
      ngayKetThucHD: new FormControl(''),
      tienDatCoc: new FormControl(''),
      tongtien: new FormControl(''),
    });
  }

  onSubmit() {
    hopdongDao.push(this.hopdongcreate.value);
    this.router.navigateByUrl('/hopdong');
  }
}
