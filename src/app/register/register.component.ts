import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

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
  constructor(
    private toast: ToastrService,
    private router: Router,
  ) { }

  ngOnInit() {
  }

  handleLogin(){
    this.toast.success('Đăng kí thành công');
    this.router.navigate(['login']);
  }

}
