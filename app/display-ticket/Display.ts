export class Display{
    tikId:number=0;
    bookDate:string="";
    numTick:number=0;
    totalCost:number=0;
    busId:number=0;
    transId:number=0;

    constructor(tikId:number,bookDate:string,numTick:number,totalCost:number,busId:number,transId:number)
    {
        this.tikId=tikId;
        this.bookDate=bookDate;
        this.numTick=numTick;
        this.totalCost=totalCost;
        this.busId=busId;
        this.transId=transId;
    }
}