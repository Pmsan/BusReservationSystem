import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DispallusersComponent } from './dispallusers.component';

describe('DispallusersComponent', () => {
  let component: DispallusersComponent;
  let fixture: ComponentFixture<DispallusersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DispallusersComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DispallusersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
