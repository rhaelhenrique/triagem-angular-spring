import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';

import { ProcessosRoutingModule } from './processos-routing.module';
import { ProcessosComponent } from './processos/processos.component';

@NgModule({
  declarations: [
    ProcessosComponent
  ],
  imports: [
    CommonModule,
    ProcessosRoutingModule,
    MatTableModule,
    MatCardModule,
    MatToolbarModule
  ]
})
export class ProcessosModule { }
