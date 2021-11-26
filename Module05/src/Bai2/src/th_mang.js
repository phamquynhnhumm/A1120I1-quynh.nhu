"use strict";
exports.__esModule = true;
var list = [1, 2, 4];
var categories = ['quynh', ' nhu', 'thicvhvaydo'];
console.log(list);
//  forEach tung phan tu trong mang, toFixed giowi han so chu so sau dau phai
list.forEach(function (num) {
    console.log(num.toFixed(2));
});
// includes kiem tra tu cung cap co nam trong chuoi  trong mang hay khongo
categories.forEach(function (key) {
    console.log(key.includes('nh'));
    //    true true false
});
// mẢNG TỪ  dạng này sang dạng khác num * num
var listSquare = list.map(function (num) { return num * num; });
console.log(listSquare);
// từ 1,2,4  => 1.4.16
// lọc các phần tử thỏa mãn
var result = categories.filter(function (str) { return str.length < 5; });
console.log(result);
var x;
x = ["xinchao", 13];
//substr trích xuất 1 chuỗi  substr(1) cắt từ vị trí thứ 1 tính từ  0
console.log(x[0].substr(1));
// = > Kq: inchao
x[0] = "quynhnhu";
console.log(x);
