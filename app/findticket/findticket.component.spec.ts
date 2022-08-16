import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FindticketComponent } from './findticket.component';

describe('FindticketComponent', () => {
  let component: FindticketComponent;
  let fixture: ComponentFixture<FindticketComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FindticketComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FindticketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
