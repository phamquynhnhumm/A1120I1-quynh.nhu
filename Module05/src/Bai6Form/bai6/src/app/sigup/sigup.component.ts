import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {validate} from 'codelyzer/walkerFactory/walkerFn';

export interface SinUp {
  Email: string;
  Password: string;
  confirm_password: string;
  Country: string;
  Age: number;
  Gender: string;
  Phone: string;
}

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}

@Component({
  selector: 'app-sigup',
  templateUrl: './sigup.component.html',
  styleUrls: ['./sigup.component.css']
})


export class SigupComponent implements OnInit {
  siup: FormGroup;
  singupp: SinUp[] = [{
    Email: 'quiynhnhu28092',
    Password: 'quynhnhu',
    confirm_password: 'quynhnhu',
    Country: 'Vietjnanm',
    Age: 21,
    Gender: 'nu',
    Phone: '0949599595',
  }];

  constructor(private fb: FormBuilder) {
  }
  ngOnInit(): void {
    // @ts-ignore
    this.siup = this.fb.group({
      Email: ['', [Validators.required, Validators.email]],
      pwGroup: this.fb.group({Password: ['', [Validators.required, Validators.minLength(6)]], confirm_password: ['', [Validators.required, Validators.minLength(6)]]}, {validator: comparePassword}),
      Country: ['', Validators.required],
      Age: ['', [Validators.required, Validators.minLength(18)]],
      Gender: ['', Validators.required],
      Phone: ['', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)]],
    });
  }
  submit() {
    console.log(this.siup.value);
    this.singupp.push(this.siup.value);
    console.log('tài khoản' + this.singupp);
  }
}
