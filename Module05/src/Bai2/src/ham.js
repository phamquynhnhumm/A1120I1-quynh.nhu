function square(num) {
    return num * num;
}
console.log(square(5));
var squereFE = function (num) {
    return num * num;
};
console.log(squereFE(2));
function add(a) {
    return function (b) {
        return a + b;
    };
}
var addWith5 = add(6);
console.log(add(6));
console.log(addWith5(4));
console.log(addWith5(7));
