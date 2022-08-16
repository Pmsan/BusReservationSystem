import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Display } from '../display-ticket/Display';
import { SharecompService } from '../sharecomp.service';
import { TickethttpService } from '../tickethttp.service';
import { findTicket } from './Find';
import { sticket } from './sticket';

@Component({
  selector: 'app-findticket',
  templateUrl: './findticket.component.html',
  styleUrls: ['./findticket.component.css']
})
export class FindticketComponent implements OnInit {
  tfind!:findTicket;
  tId:any;
  tlist:sticket[]=[];
  

  constructor(private shareser:SharecompService,private findserv:TickethttpService,private route:Router) { }

  oneticket:findTicket[]=[];
  ngOnInit(): void {
    this.tId=this.shareser.rectid();
    console.log("Ticket id "+this.tId);
    this.findticket(this.tId);
  }

  findticket(tId:number)
  {
    this.tfind=new findTicket(tId);
    this.findserv.oneticket(this.tfind).subscribe(response=>{this.tlist=response});
  }

}
