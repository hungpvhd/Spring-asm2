import { Component, OnInit } from '@angular/core';
import { Location, DOCUMENT, isPlatformBrowser } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  constructor(
    private location: Location
  ) { }

  invalidSession: boolean;

  ngOnInit() {
    if (this.location.path() == "") {
      this.invalidSession = false;
    } else {
      this.invalidSession = true;
    }
  }
}
