import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { DataService } from '../servicesAPI/data.service';
import { RegisterService } from '../servicesAPI/register.services';

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
    private dataService: DataService,
    private registerServices: RegisterService,
  ) { }

  ngOnInit() {
    
  }

  handleLogin() {
    // this.toast.success('Đăng kí thành công');
    const userData = {
      email: this.email,  
      password: this.password,
      phone: this.phone,
      username: this.username,
      oneTimePassword: '',
    };
    const phone = "+84"+this.phone.substring(1)
    this.dataService.setUserData(userData);
    this.registerServices.sendOTP({phone: phone, username : this.username}).subscribe();
    this.router.navigate(['otp']);
  }

}
