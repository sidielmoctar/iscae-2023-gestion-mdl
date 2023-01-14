import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdlListComponent } from './mdl-list.component';

describe('MdlListComponent', () => {
  let component: MdlListComponent;
  let fixture: ComponentFixture<MdlListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MdlListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MdlListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
