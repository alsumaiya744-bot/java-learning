
let promiseWithTime=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        let success=true;
        if(success)
        {
            resolve("Promise resolved successfully after 2 seconds");
        }
        else
        {
            reject("Promise rejected after 2 seconds");
        }
    },2000);
});
promiseWithTime

.then((message)=>
{
    console.log(message);
})
.catch((error)=>{
    console.log(error);
});