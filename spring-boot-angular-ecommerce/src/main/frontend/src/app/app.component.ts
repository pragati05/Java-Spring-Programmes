import {Component} from '@angular/core';
import {shopping-cartService} from "./shopping-cart/services/shopping-cartService";

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css'],
    providers: [shopping-cartService]
})
export class AppComponent {

}
