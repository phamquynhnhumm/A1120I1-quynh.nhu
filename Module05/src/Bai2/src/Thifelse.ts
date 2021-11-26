//if else
let count = 50;
if (count > 0) {
    count--;
} else {
    count = 0;
}
console.log(count);
// for
const keys = "quynhnhu2809";
for (let index = 0; index < keys.length; ++index) {
    console.log(keys[index]);
}

// wwhile
let index = 0;
while (index < keys.length) {
    console.log(keys[index]);
    ++index;

}

//do wwhile
index = 0;
do {
    console.log(keys[index]);
    ++index;
} while (index < keys.length);


// for of loop
let keys2 = [1, 3, 4, 44];
for (const item of keys2) {
    console.log(item);
}


// for in loop
const usser = {name: "quynh", age: 59};

for (const key in usser) {

    console.log(`${key}: ${usser[key]}`);
}






