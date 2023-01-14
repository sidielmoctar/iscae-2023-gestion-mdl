import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {LocalDbService} from "../../services/local-db.service";
import {UtilService} from "../../services/util.service";

@Injectable()
export class ProduitService {

  constructor(private httpClient: HttpClient,
              private utilService: UtilService,
  ) {
  }

  getProduits() {

    return this.httpClient.get("http://sup-er-app.herokuapp.com/apis/produit/", {
      headers: this.utilService.getHeadersWithToken()
    })
  }
}
