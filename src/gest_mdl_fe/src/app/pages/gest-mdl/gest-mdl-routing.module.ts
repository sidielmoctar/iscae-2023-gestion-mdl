import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MdlListComponent} from "./components/mdl-list/mdl-list.component";

const routes: Routes = [
  {
    path: "",
    component: MdlListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GestMdlRoutingModule { }
