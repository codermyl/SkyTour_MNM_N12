import { Component, OnInit, AfterViewInit, ElementRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit, AfterViewInit {

  messageIndex: number = 0;
  messages: string[] = ['Hà Nội', 'Đà Nẵng', 'Hồ Chí Minh', 'Hải Phòng'];

  images = [
    '../assets/images/hero-slider-1.jpg',
    '../assets/images/hero-slider-2.jpg',
    '../assets/images/hero-slider-3.jpg',
    '../assets/images/hero-slider-4.jpg',
    '../assets/images/hero-slider-5.jpg'
  ];

  activeIndex = 0;

  @ViewChild('typedMessage', { static: false }) typedMessageElement!: ElementRef;

  constructor(
    private router: Router,
    public app: AppServiceService
  ) { }

  ngOnInit() {
    this.startTyping();
    this.startSlideshow();
  }

  ngAfterViewInit() {
    this.typedMessageElement.nativeElement.innerHTML = '';
  }

  search() {
    this.router.navigate(['category']);
  }

  startTyping() {
    const typingSpeed = 200;
    const message = this.messages[this.messageIndex];

    for (let i = 0; i < message.length; i++) {
      setTimeout(() => {
        this.typedMessageElement.nativeElement.innerHTML += message[i];
      }, i * typingSpeed);
    }

    this.messageIndex = (this.messageIndex + 1) % this.messages.length;

    setTimeout(() => {
      this.typedMessageElement.nativeElement.innerHTML = '';
      this.startTyping();
    }, message.length * typingSpeed);
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
