import { Component, OnInit } from '@angular/core';
import * as $ from "jquery";
import { Typed } from 'src/assets/js/typed';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'SkyTour_MNM';
  ngOnInit(): void {
    console.log($(document));
    
  }
}
