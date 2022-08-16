export class Newbus{
	busName:string="";
	source:string="";
	destination:string="";
	departureTime:string="";
	departureDate:string="";
	seatsAvailable:number=0;
	cost:number=0.0;
	busType:string="";
	ac:boolean=false;

    constructor(busName:string,source:string,destination:string,departureTime:string,departureDate:string,
        seatsAvailable:number=0,cost:number=0.0,busType:string,ac:boolean){


		this.busName = busName;
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.seatsAvailable = seatsAvailable;
		this.cost = cost;
		this.busType = busType;
		this.ac = ac;

    }

	
}

