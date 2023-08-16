import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-services',
  templateUrl: './services.component.html',
  styleUrls: ['./services.component.css']
})
export class ServicesComponent implements OnInit {

  constructor(
    public app: AppServiceService
  ) { }

  ngOnInit() {
  }

}
