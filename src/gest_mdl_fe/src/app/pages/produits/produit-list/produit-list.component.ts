import { Component, OnInit } from '@angular/core';
import {ProduitService} from "../produit.service";

@Component({
  selector: 'app-produit-list',
  templateUrl: './produit-list.component.html',
  styleUrls: ['./produit-list.component.css']
})
export class ProduitListComponent implements OnInit {
  produits: any;

  constructor(private produitService: ProduitService) { }

  ngOnInit(): void {
    this.produitService.getProduits().subscribe((produits) => {
      this.produits = produits;
    })
  }

}
