import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { BushttpService } from '../bushttp.service';
import { SharecompService } from '../sharecomp.service';
import { TransactionService } from '../transaction.service';
import { seatbus } from './seatbus';
import { Ticket } from './Ticket';
import { Transaction } from './transaction';
import { DatePipe } from '@angular/common';
import { TickethttpService } from '../tickethttp.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {
  [x: string]: any;
  paytm: string[] = ['wallet', 'upi', 'internet banking']
  transactionForm!: FormGroup;
 message: number=0;
 res:number=0;
 totalamount :number=0;
 transaction!:Transaction;
 amt:number=0;
 busid:number=0;
 seats:number=0;
supbus!:seatbus;
tick!:Ticket;
uid=localStorage.getItem("userid");  usid:number=Number(this.uid);
bookDate:Date= new Date();
bdate:string=JSON.stringify(this.bookDate);
tid:number=0;


transaction1: Transaction = new Transaction(0.0, "", 0);
  constructor(private shareser:SharecompService,private httptrans: TransactionService, private fb: FormBuilder, private router: Router,private busser:BushttpService,private tservice:TickethttpService) {
 
    this.transactionForm = this.fb.group({
      userId: [''],
      amount: [''],
      paymType: ['']
    })

  }


  public addTransaction() {
     //  this.amt=0; alert("caght");
     this.transaction=new Transaction(this.totalamount,this.transactionForm.value.paymType,this.usid);

    //  let response = this.httptrans.doTransactions(this.transaction);
    //       response.subscribe((data) => this.generateticket(data));
    //       console.log(typeof(this.message));
    //       alert("Transaction successful");
    this.httptrans.doTransactions(this.transaction).subscribe((response:any)=>
     this.generateticket(response)
     );

   this.supbus=new seatbus(this.busid,this.seats);
        this.busser.updateseats(this.supbus).subscribe((response:any)=>
        console.log(response));


        //  this.amt = this.message;
       
        // if (this.amt > 0) {
        //   Swal.fire( 'Done', 'your ticket is booked','success');
        // }
        // else {
        //   Swal.fire('sorry', 'insufficient balance:)', 'error');
        // }


   
  }

  generateticket(b:number){
    this.tick=new Ticket(this.bdate,this.seats,this.totalamount,this.busid,b);
    console.log(this.tick);
   this.tservice.addtick(this.tick).subscribe((data:number)=>alert("your Ticket_id "+data));
    //alert("ticketid "+this.tid);
    alert("your"+" Transaction_Id "+b);
    this.router.navigate(['findticket']);
  }

  // validatetrans(amt:number){

  //   if (this.amt > 0) {
  //     Swal.fire( 'Done', 'your ticket is booked','success');
  //   }
  //   else {
  //     Swal.fire('sorry', 'insufficient balance:)', 'error');
  //   }


  // }
ngOnInit() {

      
    let res = this.shareser.recseats();
    this.totalamount = res.totalamt;
    this.busid=res.busid;
    this.seats=res.seats;
    // this.shareser.sendtid(this.tid);

   }

}
