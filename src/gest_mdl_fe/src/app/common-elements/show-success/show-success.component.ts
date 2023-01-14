import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-show-success',
  templateUrl: './show-success.component.html',
  styleUrls: ['./show-success.component.css']
})
export class ShowSuccessComponent implements OnInit {

  @Input("msg") msg: any;

  constructor() { }

  ngOnInit(): void {
  }

}
