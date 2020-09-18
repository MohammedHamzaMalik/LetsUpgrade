//Program to search for a particular character in a string

var string = "example@gamil.com";

var number = prompt("Enter any index number:");
var particular_char = string.charAt(number);
document.write("The letter at the entered index number is: ",particular_char);

//Program to convert minutes to seconds

const second = 60;
var minutes = prompt("Enter minutes:");
var seconds = second * minutes
document.write("The total number of seconds are ", seconds);

// Program to search for a element in a array of strings

const fruits = ['apple', 'banana', 'mango'];
var check = fruits.includes('apple');
document.write(check);

// Program to display only elements containing 'a' in them from a array

const arr = ['arm', 'apple', 'ear', 'blue', 'purple'];
let new_a = []

// Print an array in reverse order
var fruits = ['apple', 'banana', 'mango'];
var new_arr = fruits.reverse();
document.write(new_arr);
