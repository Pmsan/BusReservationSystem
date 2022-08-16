export class User{
    name:string='';
    contact:number=0;
    emailId:string='';
    password:string='';
    gender:string='';
    address:string='';
    walletAmt:number=0;

    constructor(name:string,contact:number,emailId:string,password:string,gender:string,address:string,walletAmt:number){
        this.name = name;
		this.contact = contact;
		this.emailId = emailId;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.walletAmt = walletAmt;
    }
}