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
  }

  startSlideshow() {
    setInterval(() => {
      this.nextSlide();
    }, 2000);
  }

  nextSlide() {
    this.activeIndex = (this.activeIndex + 1) % this.images.length;
  }
  
}
