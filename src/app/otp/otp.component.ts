import { RegisterService } from './../servicesAPI/register.services';
import { Component } from '@angular/core';
import { DataService } from '../servicesAPI/data.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-otp',
  templateUrl: './otp.component.html',
  styleUrls: ['./otp.component.scss'],
})
export class OtpComponent {
  constructor(private dataService: DataService,
    private registerservices: RegisterService,
    private toast: ToastrService,
    private router: Router
  ) { }
  userData: any;
  otp: string = '';
  ngOnInit() {
    // Nhận dữ liệu người dùng từ service
    this.userData = this.dataService.getUserData();
  }
  submitOTP() {
    this.userData.oneTimePassword = this.otp;
    this.registerservices.validateOTP(this.userData).subscribe(
      (res) => {
        if (res.status === 200) {
          // Nếu mã trạng thái là 200, chuyển đến trang đăng nhập
          this.toast.success('Bạn đã đăng ký thành công')

        } else {
          // Nếu mã trạng thái là 500, hiển thị thông báo lỗi
          this.toast.success('Bạn đã đăng ký thành công')
          this.router.navigate(['/login']);

        }
      },
      (error) => {
        // Xử lý lỗi nếu có
        this.toast.error('Mã OTP sai');
      }
    );
  }
}








