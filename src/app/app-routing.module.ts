import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContactComponent } from './contact/contact.component';
import { IndexComponent } from './index/index.component';
import { DetailComponent } from './detail/detail.component';
import { PayComponent } from './pay/pay.component';
import { ServicesComponent } from './services/services.component';
import { CategoryComponent } from './category/category.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { OtpComponent } from './otp/otp.component';

const routes: Routes = [
  {
    path:'contact',
    component: ContactComponent,
  },
  {
    path:'login',
    component: LoginComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
  {
    path:'',
    component: IndexComponent,
  },

  {
    path:'detail',
    component: DetailComponent,
  },

  {
    path:'pay',
    component: PayComponent,
  },

  
  {
    path:'services',
    component: ServicesComponent,
  },

  {
    path:'category',
    component: CategoryComponent,
  },

  {
    path:'otp',
    component: OtpComponent,
  },

  


];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
