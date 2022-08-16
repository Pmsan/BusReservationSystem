import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserhttpService } from '../userhttp.service';
import { User } from './User';

@Component({
  selector: 'app-user-reg',
  templateUrl: './user-reg.component.html',
  styleUrls: ['./user-reg.component.css']
})
export class UserRegComponent implements OnInit {
  userForm!:FormGroup;
  uadd!:User;

  constructor(private fb:FormBuilder,private userservice:UserhttpService,private router:Router) { }

  ngOnInit(): void {
    this.userForm = this.fb.group({
      name:['',Validators.required],contact:['',Validators.required],emailId:['',Validators.required],password:['',Validators.required],gender:['',Validators.required],address:['',Validators.required],walletAmt:[0]
    });
  }

  reguser(){
      this.uadd=new User(this.userForm.value.name,this.userForm.value.contact,this.userForm.value.emailId,this.userForm.value.password
        ,this.userForm.value.gender,this.userForm.value.address,this.userForm.value.walletAmt);

        this.userservice.adduser(this.uadd).subscribe((response:any)=>
        this.router.navigate(['landingpage']));
  }

}
