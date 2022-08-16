import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginserviceService {
  baseurl:string="http://localhost:8090/user-api"
  constructor(private LoginService:HttpClient) {}

  public login(u:any){
      return this.LoginService.post<any>(this.baseurl+"/validateuser",u);
    }

    public getuid(u:any){
      return this.LoginService.post<any>(this.baseurl+"/getuid",u);
    }

    baseurl1:string="http://localhost:8090/admin-api"

  public adminlogin(u:any){
      return this.LoginService.post<any>(this.baseurl1+"/validateAdmin",u);
    }
}
