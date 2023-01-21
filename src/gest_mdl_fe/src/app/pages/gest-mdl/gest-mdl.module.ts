import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GestMdlRoutingModule } from './gest-mdl-routing.module';
import {SharedModule} from "../../common/shared/shared.module";
import { MdlListComponent } from './components/mdl-list/mdl-list.component';
import { MatiereListComponent } from './components/matiere-list/matiere-list.component';
import { MdlViewComponent } from './components/mdl-view/mdl-view.component';
import {MdlService} from "./services/mdl.service";


@NgModule({
  declarations: [
    MdlListComponent,
    MatiereListComponent,
    MdlViewComponent
  ],
  imports: [
    CommonModule,
    GestMdlRoutingModule,
    SharedModule
  ],
  providers: [
    MdlService
  ]
})
export class GestMdlModule { }
