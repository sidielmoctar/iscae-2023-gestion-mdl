import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'montantFormatter'
})
export class MontantFormatterPipe implements PipeTransform {

  transform(value: any, round?: any): any {
    let res;

    if(round) {
      res = Math.round(value);
    } else  {
      res = (Math.round(value * 100) / 100).toFixed(2);
    }
    return res.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, "$1 ");
  }

}
