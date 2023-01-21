import { TestBed } from '@angular/core/testing';

import { MdlService } from './mdl.service';

describe('MdlService', () => {
  let service: MdlService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MdlService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
