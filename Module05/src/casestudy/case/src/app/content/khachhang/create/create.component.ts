import {Component, OnInit} from '@angular/core';
import {nhanvienDao} from "../../../dao/nhanvienDao";
import {KhachHang} from "../../../model/KhachHang";
import {Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";
import {khachhangDao} from "../../../dao/khachhangDao";

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  khachhangCreate: FormGroup;

  constructor(private router: Router) {
  }

  ngOnInit(): void {
    this.khachhangCreate = new FormGroup({
        idKH: new FormControl(''),
        tenKH: new FormControl(''),
        loaiKh: new FormControl(''),
        ngaySinh: new FormControl(''),
        soCMND: new FormControl(''),
        luong: new FormControl(''),
        sDT: new FormControl(''),
        eMail: new FormControl(''),
        diaChi: new FormControl(''),
      }
    );
  }

  onSubmit(): void {
    // @ts-ignore
    console.log(this.khachhangCreate.value);
    // @ts-ignore
    khachhangDao.push(this.khachhangCreate.value);
    this.router.navigateByUrl('/khachhang');
  }


}
