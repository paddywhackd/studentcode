


console.log('sync...');
console.log('first');
console.log('second');
console.log('third');

console.log('async...');
console.log('first');
const p = new Promise(
    (onSuccess, onError) => {
        //do some work;

        setTimeout(() => onSuccess(42), 1500)
        console.log('second');




    }
);
p.then(())



console.log('third');