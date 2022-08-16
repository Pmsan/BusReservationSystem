import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Display } from './display-ticket/Display';

@Injectable({
  providedIn: 'root'
})
export class TickethttpService {
  baseurl:string="http://localhost:8090/tickets-api"

  constructor(private tservice:HttpClient) 
  {
    
  }

  public tickList()
    {
      return this.tservice.get<Display[]>(this.baseurl+"/getticket");
    }

  public delTicket(tId:number)
  { 
    return this.tservice.delete<any>(this.baseurl+'/delticket/'+tId);
    
  }

  public oneticket(t:any)
  {
    return this.tservice.post<any>(this.baseurl+'/displayticket',t);
  }
  public addtick(t:any){
    return this.tservice.post<any>(this.baseurl+'/addticket',t);
  }
}
