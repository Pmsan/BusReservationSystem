export class duser{
    user_Id:number=0;
    name:string='';
    contact:number=0;
    emailId:string='';
    gender:string='';
    address:string='';
    walletAmt:number=0;

    constructor(user_Id:number=0,name:string,contact:number,emailId:string,gender:string,address:string,walletAmt:number){
        
        this.user_Id=user_Id;
        this.name = name;
		this.contact = contact;
		this.emailId = emailId;
		this.gender = gender;
		this.address = address;
		this.walletAmt = walletAmt;
    }
}