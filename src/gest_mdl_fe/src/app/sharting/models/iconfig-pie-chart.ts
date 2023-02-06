export interface IConfigPieChart {
  titre: string;
  subTitle?: any;
  seriesData: IConfigPieChartData[]
}

export interface  IConfigPieChartData {
  name: string;
  y: number;
}
