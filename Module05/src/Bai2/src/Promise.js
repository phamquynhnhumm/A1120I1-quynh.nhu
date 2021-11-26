"use strict";
exports.__esModule = true;
var wait5Secs = new Promise(function (resolve, rejects) {
    setImmediate(function () {
        resolve(15);
    }, 5000);
});
wait5Secs.then(function (data) { return console.log(data); })["catch"](function (err) { return console.error(err); });
// promise chỉ resolve hoặc reject duy nhất 1 lần
var promise = new Promise(function (resolve, reject) {
    resolve('done');
    reject(new Error('...'));
    setTimeout(function () {
        return resolve('...');
    });
});
promise.then(function (data) { return console.log(data); });
