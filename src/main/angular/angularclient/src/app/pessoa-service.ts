import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Pessoa } from './pessoa';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class PessoaService {

  private pessoasUrl: string;

  constructor(private http: HttpClient) { 
    this.pessoasUrl = 'http://localhost:8080/';
  }

  public findAll() : Observable<Pessoa[]> {
    return this.http.get<Pessoa[]>(this.pessoasUrl + 'list');
  }

  public save(pessoa : Pessoa) {
    return this.http.post<Pessoa>(this.pessoasUrl + 'save', pessoa);
  }

  public delete() {
    return this.http.delete<Pessoa>(this.pessoasUrl + 'delete');
  }

  public edit(pessoa : Pessoa) {
    return this.http.put<Pessoa>(this.pessoasUrl + 'edit', pessoa);
  }

}
