import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import { AppServiceService } from '../app-service.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  email: string = ''
  password: string = ''
  constructor(
    private toast: ToastrService,
    private router: Router,
    private app: AppServiceService,
  ){}
  ngOnInit(){

  }
  handleLogin() {
    console.log(this.email);
    console.log(this.password);
    this.toast.success('Đăng nhập thành công');
    this.app.isLoggin = true;
    this.router.navigate([''])
  }
}