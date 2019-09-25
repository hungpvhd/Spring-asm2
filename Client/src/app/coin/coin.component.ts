import { Component, OnInit } from '@angular/core';
import axios from 'axios';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-coin',
  templateUrl: './coin.component.html',
  styleUrls: ['./coin.component.css']
})
export class CoinComponent implements OnInit {

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

  public createMarket: Function = async (name, description) => {
    const that = this;
    var obj = {
      name: name,
      description: description
    };

    axios.post(that.API_COIN, obj)
      .then(function (response) {
        (<HTMLElement>document.getElementById('closeModal')).click();
        Swal.fire({
          type: 'success',
          title: 'Market Created!',
          text: 'Create market successful!'
        });
        that.getCoin();
      })
      .catch(function (error) {
        // handle error
        console.log(error);
      });
  }

  public createCoin: Function = (name, baseAsset, quoteAsset, lastPrice, volumn24h, marketId) => {
    const that = this;
    if (marketId == "") return;
    let obj = {
      name: name,
      baseAsset: baseAsset,
      quoteAsset: quoteAsset,
      lastPrice: lastPrice,
      volumn24h: volumn24h,
      marketId: marketId
    }

    axios.post(that.API_COIN, obj)
      .then(function (response) {
        (<HTMLElement>document.getElementById('closeModal')).click();
        Swal.fire({
          type: 'success',
          title: 'Coin Created!',
          text: 'Create coin successful!'
        });
        that.getCoin();
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
