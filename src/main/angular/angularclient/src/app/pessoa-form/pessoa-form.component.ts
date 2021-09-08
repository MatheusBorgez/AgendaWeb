import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pessoa } from '../pessoa';
import { PessoaService } from '../pessoa-service';

@Component({
  selector: 'app-pessoa-form',
  templateUrl: './pessoa-form.component.html',
  styleUrls: ['./pessoa-form.component.css']
})

export class PessoaFormComponent {

  pessoa: Pessoa;

  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private pessoaService: PessoaService) {
    this.pessoa = new Pessoa();
  }

  onSubmit() {
    this.pessoaService.save(this.pessoa).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/']);
  }
}
