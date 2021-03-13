import { Component, OnInit } from '@angular/core';
import { ApiService } from './api.service';
import { Place } from './models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  place: Place;
  
  constructor(private apiService: ApiService) {
  }

  formatTime(num: number) { 
    console.log('num > ', num);
    var str = num + '';
    console.log('str > ', str);
    var padded = str.padStart(4, '0');
    console.log('padded > ', padded);
    return padded.substr(0, 2) + ':' + padded.substr(2, 2);         
  }

  ngOnInit() {
    this.apiService.getPlace(1).subscribe(place => {
      console.log('getting place > ', place);
      this.place = place;
    });
    
  }
}
