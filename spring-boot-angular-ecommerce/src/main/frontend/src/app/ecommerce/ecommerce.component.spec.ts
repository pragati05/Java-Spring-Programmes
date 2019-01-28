import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { shopping-cartComponent } from './shopping-cart.component';

describe('shopping-cartComponent', () => {
  let component: shopping-cartComponent;
  let fixture: ComponentFixture<shopping-cartComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ shopping-cartComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(shopping-cartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
