import {Component, OnInit} from '@angular/core';
import {ProductOrder} from "../models/product-order.model";
import {shopping-cartService} from "../services/shopping-cartService";
import {Subscription} from "rxjs/internal/Subscription";
import {ProductOrders} from "../models/product-orders.model";
import {Product} from "../models/product.model";

@Component({
    selector: 'app-products',
    templateUrl: './products.component.html',
    styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
    productOrders: ProductOrder[] = [];
    products: Product[] = [];
    selectedProductOrder: ProductOrder;
    private shoppingCartOrders: ProductOrders;
    sub: Subscription;
    productSelected: boolean = false;

    constructor(private shopping-cartService: shopping-cartService) {
    }

    ngOnInit() {
        this.productOrders = [];
        this.loadProducts();
        this.loadOrders();
    }

    addToCart(order: ProductOrder) {
        this.shopping-cartService.SelectedProductOrder = order;
        this.selectedProductOrder = this.shopping-cartService.SelectedProductOrder;
        this.productSelected = true;
    }

    removeFromCart(productOrder: ProductOrder) {
        let index = this.getProductIndex(productOrder.product);
        if (index > -1) {
            this.shoppingCartOrders.productOrders.splice(
                this.getProductIndex(productOrder.product), 1);
        }
        this.shopping-cartService.ProductOrders = this.shoppingCartOrders;
        this.shoppingCartOrders = this.shopping-cartService.ProductOrders;
        this.productSelected = false;
    }

    getProductIndex(product: Product): number {
        return this.shopping-cartService.ProductOrders.productOrders.findIndex(
            value => value.product === product);
    }

    isProductSelected(product: Product): boolean {
        return this.getProductIndex(product) > -1;
    }

    loadProducts() {
        this.shopping-cartService.getAllProducts()
            .subscribe(
                (products: any[]) => {
                    this.products = products;
                    this.products.forEach(product => {
                        this.productOrders.push(new ProductOrder(product, 0));
                    })
                },
                (error) => console.log(error)
            );
    }

    loadOrders() {
        this.sub = this.shopping-cartService.OrdersChanged.subscribe(() => {
            this.shoppingCartOrders = this.shopping-cartService.ProductOrders;
        });
    }

    reset() {
        this.productOrders = [];
        this.loadProducts();
        this.shopping-cartService.ProductOrders.productOrders = [];
        this.loadOrders();
        this.productSelected = false;
    }
}
