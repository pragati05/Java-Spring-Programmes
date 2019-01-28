import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';
import {shopping-cartComponent} from './shopping-cart/shopping-cart.component';
import {ProductsComponent} from './shopping-cart/products/products.component';
import {ShoppingCartComponent} from './shopping-cart/shopping-cart/shopping-cart.component';
import {OrdersComponent} from './shopping-cart/orders/orders.component';
import {shopping-cartService} from "./shopping-cart/services/shopping-cartService";

@NgModule({
    declarations: [
        AppComponent,
        shopping-cartComponent,
        ProductsComponent,
        ShoppingCartComponent,
        OrdersComponent
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule,
        ReactiveFormsModule
    ],
    providers: [shopping-cartService],
    bootstrap: [AppComponent]
})
export class AppModule {
}
