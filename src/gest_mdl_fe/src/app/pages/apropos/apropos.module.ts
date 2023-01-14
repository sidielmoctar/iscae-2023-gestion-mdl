import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AproposRoutingModule } from './apropos-routing.module';
import { AproposComponent } from './apropos/apropos.component';
import {SharedModule} from "../../common/shared/shared.module";


@NgModule({
  declarations: [
    AproposComponent
  ],
  imports: [
    CommonModule,
    AproposRoutingModule,
    SharedModule
  ]
})
export class AproposModule { }
