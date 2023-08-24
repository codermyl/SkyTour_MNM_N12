import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root',
})
export class LoginService {
    constructor(private http: HttpClient) {

    }

    login(username: any, password: any): Observable<any> {
        const url = `http://localhost:8080/api/login/${username}/${password}`;
        return this.http.post<any>(url, {});
    }
}