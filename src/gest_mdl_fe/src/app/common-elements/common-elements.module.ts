import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ShowSuccessComponent} from "./show-success/show-success.component";
import {ShowErrorComponent} from "./show-error/show-error.component";
import {MontantFormatterPipe} from "./montant-formatter.pipe";
import { DialogConfirmComponent } from './dialog-confirm/dialog-confirm.component';
import {MaterialModule} from "../common/material/material.module";



@NgModule({
  declarations: [
    ShowSuccessComponent,
    ShowErrorComponent,
    MontantFormatterPipe,
    DialogConfirmComponent
  ],
  imports: [
    CommonModule,
    MaterialModule
  ],
  exports: [
    ShowSuccessComponent,
    ShowErrorComponent,
    MontantFormatterPipe,
    DialogConfirmComponent
  ]
})
export class CommonElementsModule { }
