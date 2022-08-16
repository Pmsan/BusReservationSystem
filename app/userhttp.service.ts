import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { duser } from './dispallusers/duser';

@Injectable({
  providedIn: 'root'
})
export class UserhttpService {

  baseurl:string="http://localhost:8090/user-api"

  constructor(private useser:HttpClient) { }

  public adduser(u:any){
    return this.useser.post<any>(this.baseurl+"/adduser",u);
   }

   public useralllist(){
    return this.useser.get<duser[]>(this.baseurl+"/getuserlist");
  }
}
