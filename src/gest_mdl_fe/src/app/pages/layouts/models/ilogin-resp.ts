export interface ILoginResp {
  status: boolean,
  message: string,
  id?: number,
  token?: string,
  data?: IInfosPerso
}

export interface IInfosPerso {
  telephone: number,
  sexe: string
}


