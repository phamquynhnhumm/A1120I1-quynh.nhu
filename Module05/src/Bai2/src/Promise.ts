import {rejects} from "assert";
import {resolve} from "dns";
import {log} from "util";
import {domainToASCII} from "url";

const wait5Secs = new Promise((resolve, rejects) => {
    setImmediate(() => {
            resolve(5);
        }, 5000
    )
});
wait5Secs.then(data => console.log(data)).catch(err => console.error(err));
// promise chỉ resolve hoặc reject duy nhất 1 lần
const promise = new Promise((resolve, reject) =>
{
   resolve('done');
   reject(new Error('...'));
   setTimeout(() =>
   resolve('...'))
});

promise.then(data =>console.log(data));
