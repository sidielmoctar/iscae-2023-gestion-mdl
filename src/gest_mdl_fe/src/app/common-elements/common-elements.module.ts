import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {ShowSuccessComponent} from "./show-success/show-success.component";
import {ShowErrorComponent} from "./show-error/show-error.component";
import {MontantFormatterPipe} from "./montant-formatter.pipe";



@NgModule({
  declarations: [
    ShowSuccessComponent,
    ShowErrorComponent,
    MontantFormatterPipe
  ],
  imports: [
    CommonModule
  ],
  exports: [
    ShowSuccessComponent,
    ShowErrorComponent,
    MontantFormatterPipe
  ]
})
export class CommonElementsModule { }
