
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BusComponent } from './bus/bus.component';
import { BookticketComponent } from './bookticket/bookticket.component';
import { AddbusComponent } from './addbus/addbus.component';
import { DispallbusComponent } from './dispallbus/dispallbus.component';
import { UpdatebusComponent } from './updatebus/updatebus.component';
import { UserRegComponent } from './user-reg/user-reg.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { TransactionComponent } from './transaction/transaction.component';
import { DisplayTicketComponent } from './display-ticket/display-ticket.component';
import { DispallusersComponent } from './dispallusers/dispallusers.component';
import { FindticketComponent } from './findticket/findticket.component';
import { MainpageComponent } from './mainpage/mainpage.component';

@NgModule({
  declarations: [
    AppComponent,
    BusComponent,
    BookticketComponent,
    AddbusComponent,
    DispallbusComponent,
    UpdatebusComponent,
    UserRegComponent,
    LandingpageComponent,
    AdminloginComponent,
    TransactionComponent,
    DisplayTicketComponent,
    DispallusersComponent,
    FindticketComponent,
    MainpageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
