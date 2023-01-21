import { Component, OnInit } from '@angular/core';
import {MdlService} from "../../services/mdl.service";
import {IMdl} from "../../models/imdl";
import {timer} from "rxjs";

@Component({
  selector: 'app-mdl-list',
  templateUrl: './mdl-list.component.html',
  styleUrls: ['./mdl-list.component.css']
})
export class MdlListComponent implements OnInit {
  modules: IMdl[] = []
  idCurMdl: any;
  curIndex: any;
  showMat: boolean = true;

  constructor(private mdlService: MdlService) { }

  ngOnInit(): void {
    this.mdlService.getModules().subscribe(data => {
      this.modules = data;
    })
  }

  showMatieres(idMdl: number, ind:number) {
      this.curIndex = ind;
      this.idCurMdl = idMdl;
      this.showMat = false;
      timer(50).subscribe(() => {
        this.showMat = true;
      })
  }
}
