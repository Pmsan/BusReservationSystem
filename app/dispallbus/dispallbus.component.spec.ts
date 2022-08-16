import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DispallbusComponent } from './dispallbus.component';

describe('DispallbusComponent', () => {
  let component: DispallbusComponent;
  let fixture: ComponentFixture<DispallbusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DispallbusComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DispallbusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
