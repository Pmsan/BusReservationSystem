import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TickethttpService } from '../tickethttp.service';
import { Display } from './Display';

@Component({
  selector: 'app-display-ticket',
  templateUrl: './display-ticket.component.html',
  styleUrls: ['./display-ticket.component.css']
})
export class DisplayTicketComponent implements OnInit {
  tickList:Display[]=[];
  tId:number=0;

  constructor(private dispserv:TickethttpService,private route:Router) { }

  ngOnInit(): void {
    this.DisplayAll()
  }

  DisplayAll()
  {
    this.dispserv.tickList().subscribe(response=>{this.tickList=response});
  }

  cancelticket(tId:number)
  {
    console.log(tId);
    this.dispserv.delTicket(tId).subscribe(response=>{this.route.navigate(['cancel-ticket'])});
  }

}
