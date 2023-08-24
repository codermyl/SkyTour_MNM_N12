import { Injectable } from '@angular/core';

@Injectable()
export class DataService {
  private userData: any;

  setUserData(data: any) {
    this.userData = data;
  }

  getUserData() {
    return this.userData;
  }
}
