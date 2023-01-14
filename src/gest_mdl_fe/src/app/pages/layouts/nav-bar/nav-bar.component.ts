import { Component, OnInit } from '@angular/core';
import {AuthentificationService} from "../authentification.service";

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {

  constructor(private authentificationService: AuthentificationService) { }

  ngOnInit(): void {
  }

  logOut() {
    this.authentificationService.logOut();
  }

}
