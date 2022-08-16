import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bus } from '../bus/Bus';
import { BushttpService } from '../bushttp.service';
import { SharecompService } from '../sharecomp.service';

@Component({
  selector: 'app-dispallbus',
  templateUrl: './dispallbus.component.html',
  styleUrls: ['./dispallbus.component.css']
})
export class DispallbusComponent implements OnInit {

  allblist:Bus[]=[];

  constructor(private serbus:BushttpService,private router:Router,private shareser:SharecompService) { }

  ngOnInit(): void {
    this.dispallbus();
  }

  dispallbus(){
    this.serbus.dispallbus().subscribe(response => {this.allblist=response});
  }

  update(b:any){
    this.shareser.sendbus(b);
   this.router.navigate(['updatebus'])
  }

}
