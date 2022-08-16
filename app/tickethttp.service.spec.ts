import { TestBed } from '@angular/core/testing';

import { TickethttpService } from './tickethttp.service';

describe('TickethttpService', () => {
  let service: TickethttpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TickethttpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
