import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {IConfigPieChart} from "../../sharting/models/iconfig-pie-chart";
import {IConfigColumnChart} from "../../sharting/models/iconfig-column-chart";

@Injectable()
export class EtudiantService {

  constructor(private http: HttpClient) {
  }

  getEtudiants() {
    return this.http.get<IConfigPieChart>("http://localhost:8080/etudiants")
  }

  getNotebyMatAndGenre() {
    return this.http.get<IConfigColumnChart>("http://localhost:8080/etudiants/byMatAndGenre")
  }
}
