import { Component, OnInit } from '@angular/core';
import axios from 'axios';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  constructor() { }

  listCoin: any;

  listMarket: any;

  API_MARKET = 'http://localhost:8080/api/v1/markets';

  API_COIN = 'http://localhost:8080/api/v1/coins';

  public getCoin: Function = async () => {
    const that = this;
    axios.get(that.API_COIN)
      .then(function (response) {
        that.listCoin = response.data.data;
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      });
  }

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

  public filterCoin: Function = async (id) => {
    const that = this;
    if (id == "") {
      this.getCoin();
      return;
    }
    axios.get(that.API_COIN)
      .then(function (response) {
        that.listCoin = response.data.data.filter((coin) => {
          return coin.market.id == id;
        });
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      });
  }

  ngOnInit() {
    this.getCoin();
    this.getMarket();
  }

}
