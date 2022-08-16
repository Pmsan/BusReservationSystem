export class seatbus{
    busId:number=0;
    seatsAvailable:number=0;

    constructor(busId:number,seatsAvailable:number){
       this.busId=busId;
       this.seatsAvailable=seatsAvailable;
    }
}