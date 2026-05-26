function greet()
{
    console.log("Hello, World!");
}
setInterval(greet,2000);


let num=1;
function numberIncrement()
{
    console.log(num);
    num++;
    if(num>10)
    {
        clearInterval(interval);
    }
}
let interval=setInterval(numberIncrement,1000);


function displayTime()
{
    let currentTime=new Date()
    console.log("Current time is: "+currentTime.toLocaleTimeString());
}
setInterval(displayTime,1000);

let num1=2;
function evenNumbers()
{
    console.log(num1);
    num1+=2
}
setInterval(evenNumbers,2000);

let num2=10;
function contDown()
{
    console.log(num2);
    num2--;
    if(num2<0)
    {
        clearInterval(countdown);
    }
}
let countdown=setInterval(contDown,2000);