import {Component, Input, OnInit} from '@angular/core';
import {MdlService} from "../../services/mdl.service";
import {IMatiere} from "../../models/imatiere";
import {IRef} from "../../../../models/iref";
import {ReferentielService} from "../../../../services/referentiel.service";
import {MatDialog} from "@angular/material/dialog";
import {DialogConfirmComponent} from "../../../../common-elements/dialog-confirm/dialog-confirm.component";

@Component({
  selector: 'app-matiere-list',
  templateUrl: './matiere-list.component.html',
  styleUrls: ['./matiere-list.component.css']
})
export class MatiereListComponent implements OnInit {

  @Input("idMdl") idMdl: any;
  matieres: IMatiere[] = [];
  professeurs: IRef[] = [];
  curMatiere = <IMatiere>{}

  constructor(private mdlService: MdlService,
              private referentielService: ReferentielService,
              public dialog: MatDialog) {
  }

  ngOnInit(): void {
    this.mdlService.getMatieres(this.idMdl).subscribe(data => {
      this.matieres = data;
    })

    this.referentielService.getProfesseurs().subscribe(data => {
      this.professeurs = data;
    })
  }


  fillForm(mat: IMatiere) {
    this.curMatiere = mat;
  }

  delete(id: number) {
    let dialogRef = this.dialog.open(DialogConfirmComponent, {
      width: '250px'
    });

    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        console.log("suppression ========== : appel backend")
      }
    });


  }

  save() {
    if (this.curMatiere.id) {
      this.mdlService.updateMat(this.curMatiere).subscribe(() => {
        this.curMatiere = <IMatiere>{}
      })
    } else {
      this.curMatiere.idMdl = this.idMdl;
      this.mdlService.addMat(this.curMatiere).subscribe(() => {
        this.curMatiere = <IMatiere>{}
      })
    }
  }
}
