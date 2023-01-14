import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree} from '@angular/router';
import {Observable} from 'rxjs';
import {LocalDbService} from "./local-db.service";
import {UtilService} from "./util.service";

@Injectable({
  providedIn: 'root'
})
export class AppGuard implements CanActivate {

  constructor(private localDbService: LocalDbService,
              private utilService: UtilService) {
  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {

    if (this.localDbService.token) {
      return true;
    }

    this.utilService.navigateByUrl("login");
    return false;
  }

}
