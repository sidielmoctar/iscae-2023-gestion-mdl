import {Component, HostListener} from '@angular/core';
import {LocalDbService} from "./services/local-db.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ecommerceFront';


  constructor(private localDbService: LocalDbService) {
  }

  @HostListener('window:beforeunload', ['$event'])
  beforeUnload($event: any) {
    sessionStorage.setItem('token', JSON.stringify(this.localDbService.token));
  }


}
