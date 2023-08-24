import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class RegisterService {
    constructor(private http: HttpClient) {

    }

    sendOTP(data: any): Observable<any> {
        return this.http.post<any>('http://localhost:8080/register/send-otp', data);
    }
    validateOTP(data: any): Observable<any> {
        return this.http.post<any>('http://localhost:8080/register/validate-otp', data);

    }
}
