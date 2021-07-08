//recursion
function countdownRecursion(num){
    if (num <= 0){
        console.log('all done!'); 
        return;
    }
    console.log(num)
    num--;
    countdown(num)
}

//Iteration 
function countdownIteration(num){
    for (let idx=num; idx>0; idx--){
        console.log(idx)
    }
    console.log('all done')
}

console.log('########Recusion############')
console.log(countdownRecursion(10))
console.log('########Itaration############')
console.log(countdownIteration(10))