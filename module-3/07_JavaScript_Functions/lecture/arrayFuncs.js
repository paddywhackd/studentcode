

function incrementArray(arr) {
    let results = [];
    for (let val of arr) {
        let newValue = val + incrementArray;
        results.push(newValue);
    }
    return results;
}


function decrementArray(arr) {
    let results = [];
    for (let val of arr) {
        let newValue = val - 1
        results.push(newValue);
    }
    return results;
}

function doubleArray(arr) {
    let results = [];
    for (let val of arr) {
        results.push(val * 2);
    }
    return results;
}


/**
 * applies a supplied transformation to each element in the arrray returning a new array
 * 
 * @param {*[]} array - the source array to be processed 
 * @param {function} fn - the transformation to be applied
 * @returns -a new array with the transformation function applied to each
 */
function transformArray(array, fn) {
    let results = [];
    for (let val of array) {
        results.push(fun(val));
    }
    return results;
}


function sumAll(nums) {
    let result = 0;
    for (let num of nums) {

    }
    return result;
}

const nums = [1, 2, 3, 4, 5, 6];

console.log(nums.map((v) => v * 10));

nums.forEach((v) => {
    console.log(v)
});


console.log(nums.filter((v) => v % 2 === 0));

function countLetters(words) {
    return words.reduce((runningCount, word) => runningCount += word.length)
}
console.log(countLetters(["abc", "def"]));

console.log(nums.find((v) => v % 2 === 0));

nums.reduce((acc, num) => acc += num);


console.log(incrementArray(nums));
console.log(decrementArray(nums));
console.log(doubleArray(nums));
console.log(transformArray(nums, (v) => v * 10));

console.log(nums.join(","));


