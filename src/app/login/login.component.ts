import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {ToastrService} from 'ngx-toastr';
import { AppServiceService } from '../app-service.service';
import { LoginService } from '../servicesAPI/login.services';
import { error } from 'jquery';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  username: string = ''
  password: string = ''
  constructor(
    private toast: ToastrService,
    private router: Router,
    private app: AppServiceService,
    private loginService : LoginService
  ){}
  ngOnInit(){

  }
  handleLogin() {
    this.loginService.login(this.username, this.password).subscribe((res) => {
      if(res.result.ok === true) {
        this.toast.success('Đăng nhập thành công');
        this.router.navigate([''])
      } else {
        this.toast.success('Tài khoản hoặc mật khẩu không chính xác');
      }
    });
    // this.router.navigate([''])
  }
}