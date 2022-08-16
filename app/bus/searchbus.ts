export class searchbus{
	source:string="";
	destination:string="";
	departureDate:string="";
	busType:string="";
	ac:boolean=false;

    constructor(source:string,destination:string,busType:string,departureDate:string,ac:boolean){

		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.busType = busType;
		this.ac = ac;

    }
}