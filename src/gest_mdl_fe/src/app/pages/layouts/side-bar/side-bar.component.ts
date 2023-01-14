import { Component, OnInit } from '@angular/core';
import {UtilService} from "../../../services/util.service";

@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.css']
})
export class SideBarComponent implements OnInit {

  constructor(public util: UtilService) { }

  ngOnInit(): void {
  }

}
