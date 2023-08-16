import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  email: string = '';
  password: string = '';
  rePassword: string = '';
  phone: string = '';
  username: string = ''
  constructor() { }

  ngOnInit() {
  }

  handleLogin(){

  }

}
