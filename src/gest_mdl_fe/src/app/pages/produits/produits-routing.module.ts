import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProduitListComponent} from "./produit-list/produit-list.component";

const routes: Routes = [
  {
    path : "",
    component: ProduitListComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProduitsRoutingModule { }
