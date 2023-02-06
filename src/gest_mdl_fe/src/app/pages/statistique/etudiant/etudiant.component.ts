import {Component, OnInit} from '@angular/core';
import Highcharts from 'highcharts/es-modules/masters/highcharts.src';
import {HighchartsService} from "../../../sharting/highcharts.service";
import {IConfigPieChart} from "../../../sharting/models/iconfig-pie-chart";
import {EtudiantService} from "../etudiant.service";

@Component({
  selector: 'app-etudiant',
  templateUrl: './etudiant.component.html',
  styleUrls: ['./etudiant.component.css']
})
export class EtudiantComponent implements OnInit {
  Highcharts: typeof Highcharts = Highcharts;
  etudiantAdmisByGenre: any;
  etudiantAdmisByMatAndGenre: any;

  constructor(private highchartsService: HighchartsService,
              private etudiantService: EtudiantService) {
  }

  ngOnInit(): void {
    this.prepareEtudiantAdmisByGenre();
    this.prepareEtudiantAdmisByMatAndGenre();
  }

  private prepareEtudiantAdmisByGenre() {
    this.etudiantService.getEtudiants().subscribe(config => {
      this.etudiantAdmisByGenre = this.highchartsService.drawPie(config);
    })
  }

  private prepareEtudiantAdmisByMatAndGenre() {
    this.etudiantService.getNotebyMatAndGenre().subscribe(config => {
      this.etudiantAdmisByMatAndGenre = this.highchartsService.drawColumns(config);
    })
  }

}
