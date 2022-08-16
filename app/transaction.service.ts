import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {
  baseurl:string="http://localhost:8090/trans-api"
  constructor(private httptrans:HttpClient) { }
  public doTransactions(transaction:any){
    return this.httptrans.post<number>(this.baseurl+"/addtransuser",transaction,{responseType:'text' as 'json'});
  }
}
