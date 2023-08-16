import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

  constructor(
    public app: AppServiceService
  ) { }

  ngOnInit() {
    console.log(this.app);
    
  }

}
