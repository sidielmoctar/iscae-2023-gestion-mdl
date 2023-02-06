import {Injectable} from '@angular/core';
import {IConfigPieChart} from "./models/iconfig-pie-chart";
import {IConfigColumnChart} from "./models/iconfig-column-chart";

@Injectable({
  providedIn: 'root'
})
export class HighchartsService {

  constructor() {
  }

  drawPie(config: IConfigPieChart) {
    return {
      chart: {
        type: 'pie'
      },
      title: {
        text: config.titre,
        align: 'left'
      },
      subtitle: {
        text: config.subTitle,
        align: 'left'
      },

      accessibility: {
        announceNewData: {
          enabled: true
        },
        point: {
          valueSuffix: '%'
        }
      },

      plotOptions: {
        series: {
          dataLabels: {
            enabled: true,
            format: '{point.name}: {point.y:.1f}%'
          }
        }
      },

      tooltip: {
        headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
        pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
      },

      series: [
        {
          name: 'Browsers',
          colorByPoint: true,
          data: config.seriesData
        }
      ],
    }
  }

  drawColumns(config: IConfigColumnChart) {
    return {
      chart: {
        type: 'column'
      },
      title: {
        text: config.titre
      },
      subtitle: {
        text: config.subTitle
      },
      xAxis: {
        categories: config.categories,
        crosshair: true
      },
      yAxis: {
        min: 0,
        title: {
          text: config.yTitle
        }
      },
      tooltip: {
        headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
        pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
          '<td style="padding:0"><b>{point.y:.1f} </b></td></tr>',
        footerFormat: '</table>',
        shared: true,
        useHTML: true
      },
      plotOptions: {
        column: {
          pointPadding: 0.2,
          borderWidth: 0
        }
      },
      series: config.series
    }
  }
}
