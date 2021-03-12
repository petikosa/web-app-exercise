import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Place } from './models';
import {HttpClient, HttpParams} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }

  getPlace(id: number): Observable<Place> {
    return this.http.get<Place>('/place/' + id);
  }
}
