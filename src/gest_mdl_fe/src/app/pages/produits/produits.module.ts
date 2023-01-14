import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProduitsRoutingModule } from './produits-routing.module';
import { ProduitListComponent } from './produit-list/produit-list.component';
import {SharedModule} from "../../common/shared/shared.module";
import {ProduitService} from "./produit.service";


@NgModule({
  declarations: [
    ProduitListComponent
  ],
  imports: [
    CommonModule,
    ProduitsRoutingModule,
    SharedModule
  ],
  providers: [ProduitService]
})
export class ProduitsModule { }
