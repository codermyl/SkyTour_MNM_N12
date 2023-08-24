import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { ToastrModule } from 'ngx-toastr';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PayComponent } from './pay/pay.component';
import { ServicesComponent } from './services/services.component';
import { CategoryComponent } from './category/category.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CommonModule } from '@angular/common';
import { OtpComponent } from './otp/otp.component';
import {HttpClientModule } from '@angular/common/http';
import { DataService } from './servicesAPI/data.service';
@NgModule({
  declarations: [					
    AppComponent,
      PayComponent,
      ServicesComponent,
      CategoryComponent,
      LoginComponent,
      RegisterComponent,
      PayComponent,
      ServicesComponent,
      OtpComponent
   ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    FormsModule,
    ToastrModule.forRoot(),
    BrowserAnimationsModule,
    HttpClientModule,
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
