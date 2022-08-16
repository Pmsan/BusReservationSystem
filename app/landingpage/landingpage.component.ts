import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginserviceService } from '../loginservice.service';
import { luser } from './luser';

@Component({
  selector: 'app-landingpage',
  templateUrl: './landingpage.component.html',
  styleUrls: ['./landingpage.component.css']
})
export class LandingpageComponent implements OnInit {

  admin1!:FormGroup;
  user!:luser;
  constructor(private router: Router,private fb: FormBuilder,private luserserv:LoginserviceService){
    
  }

  ngOnInit(): void {
    this.admin1 = this.fb.group({
     emailId:[''],password:['']
   });
  }

  login(){
    this.user=new luser(this.admin1.value.emailId,this.admin1.value.password);
    this.luserserv.login(this.user).subscribe((response:any)=>
     this.validate(response)
     );

  }
  validate(b:boolean){
    if(b){
      this.user=new luser(this.admin1.value.emailId,this.admin1.value.password);
      this.luserserv.getuid(this.user).subscribe((response:any)=>
      this.setuidstore(response)
      );
    this.router.navigate(['bus'])
  }
  else{
    alert("Invalid credentials");
  }
}

setuidstore(uid:number){
localStorage.setItem("userid",JSON.stringify(uid));
console.log(localStorage.getItem("userid"));
}

register(){
  this.router.navigate(['userreg']);
}
  adminlogin(){
    this.router.navigate(['adminlogin']);
  }
}
