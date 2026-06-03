fetch("https://jsonplaceholder.typicode.com/todos")
.then((response)=>response.json())
.then((data)=>{
    let completedTasks=data.filter((task)=>{
        return task.completed===true;
    });
    console.log(completedTasks);
})
.catch((error)=>{
    console.log("error fetching data: "+error);
});