
const product = {
    name: "Laptop",
    price: 50000
};


function readProperty(obj, prop) {
    const value = Reflect.get(obj, prop);
    console.log("Read Operation: " + prop + " = " + value);
    return value;
}

let name = readProperty(product, "name");
console.log("Product Name: " + name);



function writeProperty(obj, prop, value) {
    Reflect.set(obj, prop, value);
    console.log("Write Operation: " + prop + " = " + value);
}


readProperty(product, "name");
readProperty(product, "price");


writeProperty(product, "price", 55000);
writeProperty(product, "name", "Gaming Laptop");


readProperty(product, "name");
readProperty(product, "price");