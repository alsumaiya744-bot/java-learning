const prompt=require("prompt-sync")();

const add=(a,b,callback)=>{
    let sum=a+b;
    callback(sum);
}
function display(result)
{
    console.log("The sum is "+result);
}
let checkOddOrEven=function(num)
{
    if(num%2==0)
    {
        console.log(num+" is a even number");
    }
    else
    {
        console.log(num+" is a odd number");
    }
}

let mul=(a,b,callback)=>{
    let num=a*b;
    callback(num);
}

let anaDisplay=function(result)
{
    console.log("The product is "+result);
    if(result>100)
    {
        console.log("The product is greater than 100");
    }
    else if(result==100)
    {
        console.log("The product is equal to 100");
    }
    else
    {
        console.log("The product is less than 100");
    }
}
let choice;
do
{
    console.log("1. Add two numbers");
    console.log("2. Check odd or even");
    console.log("3. Multiply two numbers");
    console.log("4. Exit");
    choice=Number(prompt("Enter your choice: "));
    switch(choice)
    {
        case 1:
            let num1=Number(prompt("Enter first number: "));
            let num2=Number(prompt("Enter second number: "));
            add(num1,num2,display);
            break;
        case 2:
            let num=Number(prompt("Enter a number to check odd or even: "));
            checkOddOrEven(num);
            break;
        case 3:
            let num3=Number(prompt("Enter first number: "));
            let num4=Number(prompt("Enter second number: "));
            mul(num3,num4,anaDisplay);
            break;
        case 4:
            console.log("Exiting...");
            break;
        default:
            console.log("Invalid choice");
    }

}while(choice!=4);