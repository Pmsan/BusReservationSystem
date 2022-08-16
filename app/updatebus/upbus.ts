export class upbus{
    busId:number=0;
	departureTime:string="";
	cost:number=0;

    constructor(busId:number,departureTime:string,cost:number){

		this.busId=busId;
		this.departureTime = departureTime;
		this.cost=cost;

    }
}