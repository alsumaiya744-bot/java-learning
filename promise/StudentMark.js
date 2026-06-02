let prompt=require('prompt-sync')();

let studentMark=new Promise((resolve,reject)=>{
    let mark=parseInt(prompt("Enter the student's mark: "));
    if(mark>=50)
    {
        resolve("passed");
    }
    else
    {
        reject("failed");
    }
});
studentMark
    .then((message)=>{
        console.log("The student has "+message);
    })
    .catch((error)=>{
        console.log("The student has "+error);
    });