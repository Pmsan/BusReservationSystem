import { TestBed } from '@angular/core/testing';

import { SharecompService } from './sharecomp.service';

describe('SharecompService', () => {
  let service: SharecompService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SharecompService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
