import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';
import { MarketComponent } from './market/market.component';
import { CoinComponent } from './coin/coin.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponent,
    MarketComponent,
    CoinComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
