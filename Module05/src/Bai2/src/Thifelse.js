//if else
var count = 50;
if (count > 0) {
    count--;
}
else {
    count = 0;
}
console.log(count);
// for
var keys = "quynhnhu2809";
for (var index_1 = 0; index_1 < keys.length; ++index_1) {
    console.log(keys[index_1]);
}
// wwhile
var index = 0;
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
var keys2 = [1, 3, 4, 44];
for (var _i = 0, keys2_1 = keys2; _i < keys2_1.length; _i++) {
    var item = keys2_1[_i];
    console.log(item);
}
// for in loop
var usser = { name: "quynh", age: 59 };
for (var key in usser) {
    console.log(key + ": " + usser[key]);
}
