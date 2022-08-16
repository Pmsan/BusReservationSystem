import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddbusComponent } from './addbus/addbus.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { BookticketComponent } from './bookticket/bookticket.component';
import { BusComponent } from './bus/bus.component';
import { DispallbusComponent } from './dispallbus/dispallbus.component';
import { DispallusersComponent } from './dispallusers/dispallusers.component';
import { DisplayTicketComponent } from './display-ticket/display-ticket.component';
import { FindticketComponent } from './findticket/findticket.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import { TransactionComponent } from './transaction/transaction.component';
import { UpdatebusComponent } from './updatebus/updatebus.component';
import { UserRegComponent } from './user-reg/user-reg.component';

const routes: Routes = [
  {path:'',redirectTo:'mainpage', pathMatch: 'full' },
  {path:'bus',component:BusComponent},
  {path:'booktickets',component:BookticketComponent},
  {path:'addbus',component:AddbusComponent},
  {path:'allbus',component:DispallbusComponent},
  {path:'updatebus',component:UpdatebusComponent},
  {path:'userreg',component:UserRegComponent},
  {path:'landingpage',component:LandingpageComponent},
  {path:'adminlogin',component:AdminloginComponent},
  {path:'transaction',component:TransactionComponent},
  {path:'displayticket',component:DisplayTicketComponent},
  {path:'dispalluser',component:DispallusersComponent},
  {path:'findticket',component:FindticketComponent},
  {path:'mainpage',component:MainpageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
