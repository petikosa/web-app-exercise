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

  ngOnInit() {
    this.apiService.getPlace(1).subscribe(place => {
      console.log('getting place > ', place);
      this.place = place;
    });
    
  }
}
