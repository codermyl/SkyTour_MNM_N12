import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  constructor(
    public app: AppServiceService
  ) { }

  ngOnInit() {
  }

}
