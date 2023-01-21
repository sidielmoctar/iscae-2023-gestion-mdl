import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {IRef} from "../models/iref";

@Injectable({
  providedIn: 'root'
})
export class ReferentielService {

  constructor(private http: HttpClient) { }

  getProfesseurs() {
      return this.http.get<IRef[]>("http://localhost:8080/referentiel/professeurs")
  }
}
