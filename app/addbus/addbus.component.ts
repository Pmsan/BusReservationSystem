import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { BushttpService } from '../bushttp.service';
import { Newbus } from './Newbus';


@Component({
  selector: 'app-addbus',
  templateUrl: './addbus.component.html',
  styleUrls: ['./addbus.component.css']
})
export class AddbusComponent implements OnInit {

  busForm!:FormGroup;
  bustype:string[]=['Sleeper','Semi-sleeper','luxury-seater','ordinary'];
  Busadd!:Newbus

  constructor(private fb:FormBuilder,private serbus:BushttpService,private router:Router) { }

  ngOnInit(): void {
    this.busForm = this.fb.group({
      busName:['',Validators.required],source:['',Validators.required],destination:['',Validators.required],departureTime:['',Validators.required],departureDate:['',Validators.required],seatsAvailable:['',Validators.required],cost:[0,Validators.required],busType:['',Validators.required],ac:[false]
    });

  }

  newbus(){
    this.Busadd=new Newbus(this.busForm.value.busName,this.busForm.value.source,this.busForm.value.destination,this.busForm.value.departureTime,
      this.busForm.value.departureDate,this.busForm.value.seatsAvailable,this.busForm.value.cost,this.busForm.value.busType,this.busForm.value.ac);

      this.serbus.addbus(this.Busadd).subscribe((response:any)=>
     console.log(response));
     this.router.navigate(['allbus']);


  }

}
