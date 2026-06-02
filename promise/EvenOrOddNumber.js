let prompt=require('prompt-sync')();

let oddOrEven=new Promise((resolve,reject)=>{
    let num=parseInt(prompt("Enter a number: "));
    if(num%2==0)
    {
        resolve(num+" is an even number");
    }
    else
    {
        reject(num+" is a odd number");
    }
});

oddOrEven
    .then((message)=>{
        console.log(message);
    })
    .catch((error)=>{
        console.log(error);
    });