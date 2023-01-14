import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdlViewComponent } from './mdl-view.component';

describe('MdlViewComponent', () => {
  let component: MdlViewComponent;
  let fixture: ComponentFixture<MdlViewComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdlViewComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MdlViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
