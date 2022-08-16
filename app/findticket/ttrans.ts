export class ttrans{
	
    transId:number=0;
	amount:number=0.0;
	paymType:string="";
    user_Id:number=0;
	

    constructor(transId:number,amount:number,paymType:string,user_Id:number){
        this.transId=transId;
		this.amount = amount;
        this.paymType = paymType;
        this.user_Id = user_Id;

    }
}
