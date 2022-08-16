import { Bus } from "../bus/Bus";
import { ttrans } from "./ttrans";

export class sticket{
    tikId:number=0;
    bookDate:string="";
    numTick:number=0;
    totalCost:number=0;
    bus!:Bus;
    transaction!:ttrans;

    constructor(tikId:number,bookDate:string,numTick:number,totalCost:number,bus:Bus,transaction:ttrans)
    {
        this.tikId=tikId;
        this.bookDate=bookDate;
        this.numTick=numTick;
        this.totalCost=totalCost;
        this.bus=bus;
        this.transaction=transaction;
    }
}