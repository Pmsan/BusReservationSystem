import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SharecompService {

  currentbus:any;
  busid:number=0;
  seats:number=0;
  amount:number=0;
totalamt:number=0;
tid:number=0;

  constructor() { }

  sendtid(tid:number){
    this.tid=tid;
  }

  rectid(){
   return this.tid;
  }

  sendbus(cbus:any){
    this.currentbus=cbus;
  }

  sendseats(busid:number,seats:number,amount:number){
    this.busid=busid;
    this.seats=seats;
    this.amount=amount;
this.totalamt = this.amount * this.seats;
return this.totalamt;
  }

  recseats(){
    return {'busid':this.busid,'seats':this.seats,'amount':this.amount,'totalamt':this.totalamt};
  }

  

  recbus(){
    return this.currentbus;
  }
}
