import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-show-error',
  templateUrl: './show-error.component.html',
  styleUrls: ['./show-error.component.css']
})
export class ShowErrorComponent implements OnInit {
  @Input("msg") msg: any;

  constructor() { }

  ngOnInit(): void {
  }

}
