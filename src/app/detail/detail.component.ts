import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})





export class DetailComponent implements OnInit {

  images = [
    '../../assets/images/slider-1.jpg',
    '../../assets/images/slider-2.jpg',
    '../../assets/images/slider-3.jpg',
    '../../assets/images/slider-4.jpg',
    '../../assets/images/slider-5.jpg'
  ];

  activeIndex = 0;
  
  
  constructor(
    public app: AppServiceService
  ) { }

  ngOnInit() {
    this.startSlideshow();
    console.log(this.schedule);
    
  }
  schedule: any[] = [
    {
      header: 'NGÀY 01: ĐÀ NẴNG – QUY NHƠN CITY TOUR (ĂN TRƯA,TỐI)',
      content: 'Xe và HDV sẽ đón khách tại sân bay/nhà ga, đưa đoàn đi ăn trưa tại nhà hàng, sau đó về khách sạn nghỉ ngơi Buổi chiều, bắt đầu chuyến tham quan: * Khu du lịch Ghềnh Ráng, Quý khách được dạo bước trên dốc Mộng Cầm, đồi Thi Nhân, bãi tắm Hoàng Hậu, Tiên Sa, và sống lại với những vần thơ Hàn Mặc Tử cùng tài nghệ của bút lửa Dzũ Kha. *Làng Phong Quy Hòa, nơi cuộc sống của con người bình yên, thong dong đến lạ bên dưới dàn hoa giấy rực rỡ, đây cũng là nơi Hàn Mặc Tử sinh sống trong thời gian cuối đời. *Tháp Đôi, là cụm 02 ngọn tháp Chăm được xây duyên dáng bên cạnh nhau nằm giữa lòng thành phố. *Quảng Trường Quy Nhơn, nơi tượng đài Nguyễn Sinh Sắc – Nguyễn Tất Thành uy nghi tượng trưng cho tình cha con hòa quyện với tình yêu nước. 18h00: Đưa quý khách ăn tối tại nhà hàng. Với những món ẩm thực đặc trưng miền đất võ Nghỉ đêm tại Quy Nhơn.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 02: PHÚ YÊN – XỨ NẪU HOA VÀNG CỎ XANH (ĂN SÁNG, TRƯA, TỐI)',
      content: 'A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 03: KỲ CO –LẶN NGẮM SAN HÔ- EO GIÓ – TỊNH XÁ NGỌC HÒA (ĂN SÁNG, TRƯA, TỐI)',
      content: 'When she reached the first hills of the Italic Mountains, she had a last view back on the skyline ofher hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the \nLine Lane. Pityful a rethoric question ran over her cheek, then she continued her way.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 04: CHÙA THIÊN HƯNG – TIỄN KHÁCH (ĂN SÁNG)',
      content: 'When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the \nLine Lane. Pityful a rethoric question ran over her cheek, then she continued her way.',
      isShow: true,
      
    },
    
  ]

  service: any[] = [
    {
      header: 'NGÀY 01: ĐÀ NẴNG – QUY NHƠN CITY TOUR (ĂN TRƯA,TỐI)',
      content: 'Xe và HDV sẽ đón khách tại sân bay/nhà ga, đưa đoàn đi ăn trưa tại nhà hàng, sau đó về khách sạn nghỉ ngơi Buổi chiều, bắt đầu chuyến tham quan: * Khu du lịch Ghềnh Ráng, Quý khách được dạo bước trên dốc Mộng Cầm, đồi Thi Nhân, bãi tắm Hoàng Hậu, Tiên Sa, và sống lại với những vần thơ Hàn Mặc Tử cùng tài nghệ của bút lửa Dzũ Kha. *Làng Phong Quy Hòa, nơi cuộc sống của con người bình yên, thong dong đến lạ bên dưới dàn hoa giấy rực rỡ, đây cũng là nơi Hàn Mặc Tử sinh sống trong thời gian cuối đời. *Tháp Đôi, là cụm 02 ngọn tháp Chăm được xây duyên dáng bên cạnh nhau nằm giữa lòng thành phố. *Quảng Trường Quy Nhơn, nơi tượng đài Nguyễn Sinh Sắc – Nguyễn Tất Thành uy nghi tượng trưng cho tình cha con hòa quyện với tình yêu nước. 18h00: Đưa quý khách ăn tối tại nhà hàng. Với những món ẩm thực đặc trưng miền đất võ Nghỉ đêm tại Quy Nhơn.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 02: PHÚ YÊN – XỨ NẪU HOA VÀNG CỎ XANH (ĂN SÁNG, TRƯA, TỐI)',
      content: 'A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 03: KỲ CO –LẶN NGẮM SAN HÔ- EO GIÓ – TỊNH XÁ NGỌC HÒA (ĂN SÁNG, TRƯA, TỐI)',
      content: 'When she reached the first hills of the Italic Mountains, she had a last view back on the skyline ofher hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the \nLine Lane. Pityful a rethoric question ran over her cheek, then she continued her way.',
      isShow: true,
      
    },
    {
      header: 'NGÀY 04: CHÙA THIÊN HƯNG – TIỄN KHÁCH (ĂN SÁNG)',
      content: 'When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the \nLine Lane. Pityful a rethoric question ran over her cheek, then she continued her way.',
      isShow: true,
      
    },
    
  ]

  startSlideshow() {
    setInterval(() => {
      this.nextSlide();
    }, 2000);
  }

  displaySchedule(i: number){
    this.schedule[i].isShow = !this.schedule[i].isShow
  }
  displayService(i: number){
    this.service[i].isShow = !this.service[i].isShow
  }

  nextSlide() {
    this.activeIndex = (this.activeIndex + 1) % this.images.length;
  }
  
}
