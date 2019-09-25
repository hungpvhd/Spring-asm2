import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MainComponent } from './main/main.component';
import { CoinComponent } from './coin/coin.component';
import { MarketComponent } from './market/market.component';

const routes: Routes = [
  { path: '', component: MainComponent },
  { path: 'coin', component: CoinComponent },
  { path: 'market', component: MarketComponent },
  { path: '**', component: MainComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
