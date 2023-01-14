import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatiereListComponent } from './matiere-list.component';

describe('MatiereListComponent', () => {
  let component: MatiereListComponent;
  let fixture: ComponentFixture<MatiereListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MatiereListComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatiereListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
