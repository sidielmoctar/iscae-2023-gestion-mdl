import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {UtilService} from "../../../services/util.service";
import {AuthentificationService} from "../authentification.service";
import {ILogin} from "../models/ilogin";
import {LocalDbService} from "../../../services/local-db.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  frmLogin: FormGroup = <FormGroup>{};
  showError = false;

  constructor(private utilService: UtilService,
              private formBuilder: FormBuilder,
              private localDbService: LocalDbService,
              private authentificationService: AuthentificationService,
              ) {
  }

  ngOnInit(): void {
    this.frmLogin = this.formBuilder.group({
      login : ['', Validators.required],
      password : ['', Validators.required]
    })
  }

  loginIn() {
    const loginObj: ILogin = {
      username: this.frmLogin.value.login,
      password: this.frmLogin.value.password
    }

    this.authentificationService.logIn(loginObj).subscribe(loginResp => {
      if(loginResp.status) {
        this.utilService.navigateByUrl('apropos');
        this.localDbService.token = "Token " + loginResp.token;
      } else {
        this.showError = true;
      }
    });
  }
}
