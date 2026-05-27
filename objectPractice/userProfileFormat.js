const prompt=require("prompt-sync")();
let firstName=prompt("Enter your first name: ");
let lastName=prompt("Enter your last name: ");
let email=prompt("Enter your email: ");
let user={
    userFirstName:firstName,
    userLastName:lastName,
    userEmail:email
};
let fullName=(user.userFirstName+" "+user.userLastName).toUpperCase();
let emailDomain=user.userEmail.split("@")[1];
console.log("Full Name: "+fullName);
console.log("Email Domain: "+emailDomain);