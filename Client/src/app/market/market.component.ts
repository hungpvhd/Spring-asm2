import { Component, OnInit } from '@angular/core';
import axios from 'axios';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-market',
  templateUrl: './market.component.html',
  styleUrls: ['./market.component.css']
})
export class MarketComponent implements OnInit {

  constructor() { }

  listMarket: any;

  API_MARKET = 'http://localhost:8080/api/v1/markets';

  public getMarket: Function = async () => {
    const that = this;
    axios.get(that.API_MARKET)
      .then(function (response) {
        that.listMarket = response.data.data;
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      });
  }

  public createMarket: Function = async (name, description) => {
    const that = this;
    var obj = {
      name: name,
      description: description
    };

    axios.post(that.API_MARKET, obj)
      .then(function (response) {
        (<HTMLElement>document.getElementById('closeModal')).click();
        Swal.fire({
          type: 'success',
          title: 'Market Created!',
          text: 'Create market successful!'
        });
        that.getMarket();
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      });
  }

  ngOnInit() {
    this.getMarket();
  }

}
