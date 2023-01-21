import {Component, Input, OnInit} from '@angular/core';
import {MdlService} from "../../services/mdl.service";
import {IMatiere} from "../../models/imatiere";

@Component({
  selector: 'app-matiere-list',
  templateUrl: './matiere-list.component.html',
  styleUrls: ['./matiere-list.component.css']
})
export class MatiereListComponent implements OnInit {

  @Input("idMdl") idMdl: any;
  matieres: IMatiere[] = [];

  constructor(private mdlService: MdlService) {
  }

  ngOnInit(): void {
    this.mdlService.getMatieres(this.idMdl).subscribe(data => {
      this.matieres = data;
    })
  }

}
