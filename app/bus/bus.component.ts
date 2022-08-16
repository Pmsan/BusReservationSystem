import { Component, ModuleWithComponentFactories, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { BushttpService } from '../bushttp.service';
import { Bus } from './Bus';
import { searchbus } from './searchbus';
import { Router } from '@angular/router';
import { SharecompService } from '../sharecomp.service';

@Component({
  selector: 'app-bus',
  templateUrl: './bus.component.html',
  styleUrls: ['./bus.component.css']
})
export class BusComponent implements OnInit {


  
  ddate:Date=new Date();
  isac:boolean=false;
  busForm!:FormGroup;
  busl!:searchbus;
  sbuslist:Bus[]=[];
  

   constructor(private serbus:BushttpService,private fb: FormBuilder,private router: Router,private sbus:SharecompService) { }

   bslist:Bus[]=[];
   bdlist:Bus[]=[];
   btlist:Bus[]=[];
   

  ngOnInit(): void {
     this.busForm = this.fb.group({
      source:['',Validators.required],destination:['',Validators.required],busType:['',Validators.required],departureDate:['',Validators.required],ac:[false]
    });

    this.getsrcList();
    this.getdestlist();
    this.getbtypelist();
    this.displaybus(this.sbuslist);
  }

  public getsrcList(){
    this.serbus.bsrclist().subscribe(response => {this.bslist=response});
  }

  public getdestlist(){
    this.serbus.bdestlist().subscribe(response => {this.bdlist=response});
  }

  public getbtypelist(){
    this.serbus.btypelist().subscribe(response => {this.btlist=response});
  }

  
 search(){

 //let departureDate=this.ds.transform(this.busForm.value.departureDate);
   //moment(this.busForm.value.departureDate);
  // let departureDate=JSON.stringify(this.busForm.value.departureDate);

  this.busl=new searchbus(this.busForm.value.source,this.busForm.value.destination,this.busForm.value.busType,
    this.busForm.value.departureDate,this.busForm.value.ac);

     this.serbus.searchbus(this.busl).subscribe((response:any)=>
     this.displaybus(response)
     );
     //console.log(response));

  console.log("Formsubmitted");
  //  console.log(this.busForm.value.source);
  //  console.log(this.busForm.value.destination);
  //  console.log(this.busForm.value.departureDate);
  //  console.log(this.busForm.value.busType);
  //  console.log(this.busForm.value.ac);

 }

 displaybus(b:any){
    this.sbuslist=b;
 }

 Book(b:Bus){
  this.sbus.sendbus(b);
  this.router.navigate(['booktickets']);
  console.log(b);
 }

 logout(){
  this.router.navigate(['landingpage']);
 }

 findTick(){
    this.router.navigate(['findticket']);
}
}
