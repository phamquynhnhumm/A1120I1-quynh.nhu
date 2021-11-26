function square(num: number): number {
    return num * num;
}

console.log(square(5));

const squereFE = function (num: number): number {
    return num * num;
}
console.log(squereFE(2));

function add(a: number): Function {
    return function (b: number): number {
        return a  +b;
    }
}

const addWith5 = add(6);
console.log(add(6));// anonymous
console.log(addWith5(4));  // 4 +6 = 10
console.log(addWith5(7)); // 7 +6 =13