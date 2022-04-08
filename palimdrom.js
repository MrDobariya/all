// var a="navjivan";

// var len=a.split();

// var b=a.reverse;

// var c=b.join("navjivan");

// if(a=c)
//     console.log("palimdrom number",c);
// else
//     console.log("NOT palimdrom",c)

// console.log(c);



// program to check if the string is palindrome or not

function checkPalindrome(string) {

    // convert string to an array
    const a = string.split('');

    // reverse the array values
    const b = a.reverse();

    // convert array to string
    const c = b.join('');

    if(string == c) {
        console.log('It is a palindrome');
    }
    else {
        console.log('It is not a palindrome');
    }
}

//take input
const string = "mem"
checkPalindrome(string);