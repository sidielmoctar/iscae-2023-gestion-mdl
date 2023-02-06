import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { StatistiqueRoutingModule } from './statistique-routing.module';
import { EtudiantComponent } from './etudiant/etudiant.component';
import {SharedModule} from "../../common/shared/shared.module";
import {EtudiantService} from "./etudiant.service";


@NgModule({
  declarations: [
    EtudiantComponent
  ],
  imports: [
    CommonModule,
    StatistiqueRoutingModule,
    SharedModule
  ],
  providers: [
    EtudiantService
  ]
})
export class StatistiqueModule { }
