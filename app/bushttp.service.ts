import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Bus } from './bus/Bus';

@Injectable({
  providedIn: 'root'
})
export class BushttpService {
  baseurl:string="http://localhost:8090/bus-api"
  
  constructor(private httpbusserv:HttpClient) { }

  public addbus(b:any){
   return this.httpbusserv.post<any>(this.baseurl+"/addbus",b);
  }

  public bsrclist(){
    return this.httpbusserv.get<Bus[]>(this.baseurl+"/srclist");
  }

  public bdestlist(){
    return this.httpbusserv.get<Bus[]>(this.baseurl+"/destlist");
  }

  public btypelist(){
    return this.httpbusserv.get<Bus[]>(this.baseurl+"/btypelist");
  }

  public searchbus(b:any){
    return this.httpbusserv.post<any>(this.baseurl+"/searchbus",b);

  }

  public dispallbus(){
    return this.httpbusserv.get<Bus[]>(this.baseurl+"/allbus");
  }

  public updatebus(u:any){
    return this.httpbusserv.post<any>(this.baseurl+"/upbus",u);
  }

  public updateseats(s:any){
    return this.httpbusserv.post<any>(this.baseurl+"/upseats",s);
  }

 

}
