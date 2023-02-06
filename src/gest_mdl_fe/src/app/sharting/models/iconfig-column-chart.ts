export interface IConfigColumnChart {
  titre: string;
  yTitle: any;
  subTitle?: any;
  categories: string[];
  series: IConfigComumnSeries[]
}

export interface IConfigComumnSeries {
  name: string;
  data: number[];
}
