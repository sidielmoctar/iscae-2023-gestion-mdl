import {NgModule} from '@angular/core';
import {CommonElementsModule} from "../../common-elements/common-elements.module";
import {MaterialModule} from "../material/material.module";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {HighchartsChartModule} from "highcharts-angular";


@NgModule({
  exports: [
    FormsModule,
    ReactiveFormsModule,
    CommonElementsModule,
    MaterialModule,
    HttpClientModule,
    HighchartsChartModule
  ]
})
export class SharedModule { }
