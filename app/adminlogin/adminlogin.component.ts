import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginserviceService } from '../loginservice.service';
import { ladmin } from './ladmin';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  admin2!:FormGroup;
  admin!:ladmin;

constructor(private fb:FormBuilder,private router:Router,private ladminserv:LoginserviceService){

}

  ngOnInit(): void {
    this.admin2 = this.fb.group({
     security_id:[''],passcode:['']
   });
  }

  adminlog(){
    this.admin=new ladmin(this.admin2.value.security_id,this.admin2.value.passcode);
    this.ladminserv.adminlogin(this.admin).subscribe((response:any)=>
     this.validate(response)
);

  }
  validate(b:boolean){
    console.log(b);
    if(b){
    this.router.navigate(['allbus'])
  }
  else{
    alert("Invalid credentials");
  }
}
}
