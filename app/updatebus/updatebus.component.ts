import { Time } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { BushttpService } from '../bushttp.service';
import { SharecompService } from '../sharecomp.service';
import { upbus } from './upbus';

@Component({
  selector: 'app-updatebus',
  templateUrl: './updatebus.component.html',
  styleUrls: ['./updatebus.component.css']
})
export class UpdatebusComponent implements OnInit {
  cb:any;
  uptime:string='';
  upcost:number=0;
  busForm!:FormGroup;
  ubus!:upbus;



  constructor(private shareser:SharecompService,private busser:BushttpService,private fb:FormBuilder,private router:Router) { }

  ngOnInit(): void {

    this.busForm = this.fb.group({
      departureTime:[''],cost:[0]
    });

    this.cb=this.shareser.recbus();
    this.uptime=this.cb.departureTime;
    this.upcost=this.cb.cost;
    
  }

  updatetnc(){
    this.ubus=new upbus(this.cb.busId,this.busForm.value.departureTime,this.busForm.value.cost);
   this.busser.updatebus(this.ubus).subscribe((response:any)=>
   this.router.navigate(['allbus'])
   );
  }


}
