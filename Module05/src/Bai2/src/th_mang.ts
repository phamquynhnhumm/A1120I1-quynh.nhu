import {log} from "util";

const list: number[] = [1, 2, 4];
const categories: Array<String> = ['quynh', ' nhu', 'thicvhvaydo'];
console.log(list);
//  forEach tung phan tu trong mang, toFixed giowi han so chu so sau dau phai
list.forEach((num) => {
        console.log(num.toFixed(2));
    }
)

// includes kiem tra tu cung cap co nam trong chuoi  trong mang hay khongo
categories.forEach((key) => {
    console.log(key.includes('nh'));
//    true true false
})

// mẢNG TỪ  dạng này sang dạng khác num * num
const listSquare = list.map(num => num * num);
console.log(listSquare);
// từ 1,2,4  => 1.4.16

// lọc các phần tử thỏa mãn
const  result = categories.filter(str => str.length <5)
console.log(result);


let x: [string, number];
x =["xinchao",13];
//substr trích xuất 1 chuỗi  substr(1) cắt từ vị trí thứ 1 tính từ  0
console.log(x[0].substr(1))
// = > Kq: inchao
x[0] = "quynhnhu";

console.log(x);


