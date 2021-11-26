import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.login = new FormGroup({
      Email: new FormControl('', [Validators.required, Validators.email]),
      Password: new FormControl('',[Validators.required, Validators.minLength(6)]),
    });
  }

  onSubmit() {
    // console.log(this.login);
  }
}
