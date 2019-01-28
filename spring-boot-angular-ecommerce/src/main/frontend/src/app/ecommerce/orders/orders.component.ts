import {Component, OnInit} from '@angular/core';
import {ProductOrders} from "../models/product-orders.model";
import {Subscription} from "rxjs/internal/Subscription";
import {shopping-cartService} from "../services/shopping-cartService";

@Component({
    selector: 'app-orders',
    templateUrl: './orders.component.html',
    styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {
    orders: ProductOrders;
    total: number;
    paid: boolean;
    sub: Subscription;

    constructor(private shopping-cartService: shopping-cartService) {
        this.orders = this.shopping-cartService.ProductOrders;
    }

    ngOnInit() {
        this.paid = false;
        this.sub = this.shopping-cartService.OrdersChanged.subscribe(() => {
            this.orders = this.shopping-cartService.ProductOrders;
        });
        this.loadTotal();
    }

    pay() {
        this.paid = true;
        this.shopping-cartService.saveOrder(this.orders).subscribe();
    }

    loadTotal() {
        this.sub = this.shopping-cartService.TotalChanged.subscribe(() => {
            this.total = this.shopping-cartService.Total;
        });
    }
}
