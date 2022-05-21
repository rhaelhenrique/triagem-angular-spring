import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Processo } from './../model/processo';
import { delay, first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProcessosService {

  private readonly API = 'api/processos';

  constructor(private httpClient: HttpClient) { }

  list() {
    return this.httpClient.get<Processo>(this.API)
    .pipe(
      first(),
      //delay(2000),
      tap(processos => console.log(processos))
    );
  }

}
