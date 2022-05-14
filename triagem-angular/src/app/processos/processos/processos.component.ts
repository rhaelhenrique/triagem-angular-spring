import { Processo } from './../model/processo';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-processos',
  templateUrl: './processos.component.html',
  styleUrls: ['./processos.component.scss']
})
export class ProcessosComponent implements OnInit {

  processos: Processo [] = [
    {
      _id: '1', numero: '0800534-91.2020.8.20.5001', autor: 'Testando Teste' }
  ];
  displayedColumns = ['numero', 'autor'];

  constructor() {

  }

  ngOnInit(): void {

  }

}
