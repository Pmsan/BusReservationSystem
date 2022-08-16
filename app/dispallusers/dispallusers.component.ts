import { Component, OnInit } from '@angular/core';
import { UserhttpService } from '../userhttp.service';
import { duser } from './duser';

@Component({
  selector: 'app-dispallusers',
  templateUrl: './dispallusers.component.html',
  styleUrls: ['./dispallusers.component.css']
})
export class DispallusersComponent implements OnInit {
  userlist:duser[]=[];

  constructor(private userserv:UserhttpService) { }

  ngOnInit(): void {
    this.dispalluser();
  }

  dispalluser(){
    this.userserv.useralllist().subscribe(response => {this.userlist=response});
  }

}
