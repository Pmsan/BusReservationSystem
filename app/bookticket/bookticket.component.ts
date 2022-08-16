import { Component, OnInit } from '@angular/core';
import { Input } from '@angular/core';
import { Router } from '@angular/router';
import { combineLatest } from 'rxjs';
import { Bus } from '../bus/Bus';
import { SharecompService } from '../sharecomp.service';

@Component({
  selector: 'app-bookticket',
  templateUrl: './bookticket.component.html',
  styleUrls: ['./bookticket.component.css']
})
export class BookticketComponent implements OnInit {

  cb:any;
  ntick:number=0;
  message:string='vatsav';
  availseats:number=0;
  

  constructor(private sbus:SharecompService,private router:Router) { }

  ngOnInit(): void {
    this.cb=this.sbus.recbus();
    this.tickvalid(this.ntick);
    this.availseats=this.cb.seatsAvailable;
  }

 

 

  tickvalid(ntick:number){
   if(ntick<0){
    (document.getElementById('bokt') as HTMLInputElement).disabled = true;
    this.message="Invalid input"
   }
  else if(ntick>this.availseats){
    (document.getElementById('bokt') as HTMLInputElement).disabled = true;
   this.message="Bus has reached the limit"
  }
  else if(ntick==null){
    this.message="Enter value";
  }
   else{
    (document.getElementById('bokt') as HTMLInputElement).disabled = false;
    this.message="No of tickets selected : "+ntick;
   }
  }

  bookticket(busid:number,seatsbooked:number,cost:number){
    console.log(busid);
    console.log(seatsbooked);
    console.log(cost);
    localStorage.setItem("busid",JSON.stringify(busid));
   console.log(this.sbus.sendseats(busid,seatsbooked,cost));
   this.router.navigate(['transaction']);
    
  }

  


}
