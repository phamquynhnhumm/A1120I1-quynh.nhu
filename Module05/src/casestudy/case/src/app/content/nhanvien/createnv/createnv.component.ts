import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {nhanvienDao} from '../../../dao/nhanvienDao';
import {Router} from '@angular/router';

@Component({
  selector: 'app-createnv',
  templateUrl: './createnv.component.html',
  styleUrls: ['./createnv.component.css']
})
export class CreatenvComponent implements OnInit {

  nhanvienCreate: FormGroup;

  constructor(private router: Router) {
  }

  ngOnInit(): void {
    this.nhanvienCreate = new FormGroup({
        idNV: new FormControl(''),
        tenNV: new FormControl(''),
        viTri: new FormControl(''),
        trinhDo: new FormControl(''),
        boPhan: new FormControl(''),
        ngasySinh: new FormControl(''),
        soCMND: new FormControl(''),
        luong: new FormControl(''),
        sDT: new FormControl(''),
        eMail: new FormControl(''),
        diaChi: new FormControl(''),
      }
    );
  }

  onSubmit(): void {
    console.log(this.nhanvienCreate.value);
    // @ts-ignore
    nhanvienDao.push(this.nhanvienCreate.value);
    this.router.navigateByUrl('/nhanvien');
  }
}
