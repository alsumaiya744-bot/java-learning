const prompt=require("prompt-sync")();
let name=prompt("Enter your name: ");
let phoneNumber=prompt("Enter phone Number: ");
let userName=name.slice(0,3)+phoneNumber.slice(-2);
let generatedUserName=userName.toLowerCase();
console.log("Your username is: "+generatedUserName);