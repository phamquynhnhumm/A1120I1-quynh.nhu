import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {FormControl, FormGroup} from "@angular/forms";
import {DichvuComponent} from "../dichvu.component";
import {dichvuDao} from "../../../dao/dichvuDao";

@Component({
  selector: 'app-createdv',
  templateUrl: './createdv.component.html',
  styleUrls: ['./createdv.component.css']
})
export class CreatedvComponent implements OnInit {

  dicvucreate: FormGroup;

  constructor(private router: Router) {
  }

  ngOnInit(): void {
    this.dicvucreate = new FormGroup({
      idDV: new FormControl(''),
      tenDV: new FormControl(''),
      dienTich: new FormControl(''),
      soTang: new FormControl(''),
      soNguoiToiDa: new FormControl(''),
      chiPhiThue: new FormControl(''),
      kieuThue: new FormControl(''),
      trangThai: new FormControl(''),
    });
  }

  onSubmit() {
    dichvuDao.push(this.dicvucreate.value);
    this.router.navigateByUrl('/dichvu');
  }
}
