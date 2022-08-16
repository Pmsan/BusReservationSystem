export class Transaction{
	
	amount:number=0.0;
	paymType:string="";
    user_Id:number=0;
	

    constructor(amount:number,paymType:string,user_Id:number){

		this.amount = amount;
        this.paymType = paymType;
        this.user_Id = user_Id;

    }
}
