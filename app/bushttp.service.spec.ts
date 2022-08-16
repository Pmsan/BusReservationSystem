import { TestBed } from '@angular/core/testing';

import { BushttpService } from './bushttp.service';

describe('BushttpService', () => {
  let service: BushttpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BushttpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
