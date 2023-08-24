import { Component, OnInit } from '@angular/core';
import { AppServiceService } from '../app-service.service';

@Component({
  selector: 'app-pay',
  templateUrl: './pay.component.html',
  styleUrls: ['./pay.component.css']
})
export class PayComponent implements OnInit {

  constructor(
    public app: AppServiceService
  ) { }

  personPrice: number = 2390000;
  childPrice: number = 1390000;

  person: number  =0;
  child: number = 0;
  child1: number  =0;
  child2: number =0;

  personCost: number = 0;
  childCost: number = 0;
  total: number = 0;

  ngOnInit() {
    this.person  =0;
  this.child = 0;
  this.child1  =0;
  this.child2 =0;

  this.personCost = 0;
  this.childCost = 0;
  this.total = 0;
  }

  getPrice(){
    this.personCost = this.person * this.personPrice;
    this.childCost = this.child * this.childPrice;
    this.total = this.personCost + this.childCost;
  }

}
