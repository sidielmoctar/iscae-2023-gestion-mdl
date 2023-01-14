import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowSuccessComponent } from './show-success.component';

describe('ShowSuccessComponent', () => {
  let component: ShowSuccessComponent;
  let fixture: ComponentFixture<ShowSuccessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShowSuccessComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowSuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
