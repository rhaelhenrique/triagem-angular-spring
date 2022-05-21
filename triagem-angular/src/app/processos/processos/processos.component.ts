import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { ErrorDialogComponent } from '../../shared/components/error-dialog/error-dialog.component';
import { Processo } from '../model/processo';
import { ProcessosService } from './../services/processos.service';

@Component({
  selector: 'app-processos',
  templateUrl: './processos.component.html',
  styleUrls: ['./processos.component.scss']
})
export class CoursesComponent implements OnInit {

  processos$: Observable<Processo[]>;

  displayedColumns = ['autor','processo'];

  constructor(
    private processosService: ProcessosService,
    public dialog: MatDialog,
    private router: Router,
    private route: ActivatedRoute
  ) {

    this.processos$ = this.processosService.list()
    .pipe(
      catchError(error => {
        this.onError('Erro ao carregar processos.');
        return of([])
      })
    );

  }

  onError(errorMsg: string) {
    this.dialog.open(ErrorDialogComponent, {
      data: errorMsg
    });
  }

  ngOnInit(): void {

  }

  onAdd() {
    this.router.navigate(['new'], {relativeTo: this.route});
  }

}
