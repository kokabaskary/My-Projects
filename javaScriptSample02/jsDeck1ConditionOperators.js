/**
 * This is my first javascript. this is a block comment
 */

//this is an in-line comment
console.log(4 + 3); //semi-colon ; is optional but best practice is to use it
console.log(4 * 5);
console.log(4 / 2);
console.log(2 == 2);
console.log("2" == 2);
console.log("2" == "2");
console.log(2 === 2);
console.log("2" === 2);

//----|| or &&
console.log(3 > 2 && 6 == 6);
console.log(3 > 2 && 6 == 7);
console.log(3 > 2 || 6 == 6);
console.log(3 > 2 || 6 == 7);
console.log(3 < 2 || 6 !== 6);

//----condition operators
console.log(!(3 < 2 || 6 !== 6));
console.log(!(3 > 2 && 6 == 6));

console.log(3 > 4 && 4 == 4);
console.log(3 > 4 || 4 == 4);
console.log(5 != 5 || 4 > 4) && !(2 == 2);
console.log(5 % 2 >= 2) && (!false || 4 < 0);


//-----concoate 
console.log("hola" + "my name is:" + (4 + 5));

//-----bitwise

console.log(1 & 2);
console.log(1 | 2);






console.log((1 > 2 && 6 == 6) && (3 > 2 || 6 == 6));
console.log((1 > 2 && 6 == 6) || (3 > 2 || 6 == 6));
//-----declaring variable using var keyword 
var myNumber = 6;
var myNumber = 0;
console.log(myNumber);

//-----declaring variable using let keyword 
//let myNumber=6;
//let myNumber=0;
//console.log(myNumber);

//-----arthmetic operators ++
var myNumber = 9;

console.log(myNumber++);//9

var myNumber = 9;

console.log(10 + myNumber++);//19

console.log(10 + myNumber);//20

console.log(myNumber);//10
console.log(10 + (++myNumber));//21

console.log(10 + myNumber);//21

//-----arthmetic operators --
var myNumber = 9;



console.log(myNumber);//9

console.log(10 + myNumber--);//19

console.log(10 + myNumber);//18

console.log(myNumber);//8
console.log(10 + (--myNumber));//17

console.log(10 + myNumber);//17

//------Arithmetic shortcuts

var myNumber = 10;
console.log(myNumber += 5);//15 => myNumber = myNumber + 5;
console.log(myNumber -= 5);//10 => myNumber = myNumber - 5;
console.log(myNumber %= 3);//1 => myNumber = myNumber % 5;
console.log(myNumber *= 5);//5 => myNumber = myNumber * 5;
console.log(myNumber /= 5);//1 => myNumber = myNumber / 5;

console.log(myNumber);//1
console.log("this is :" + ((myNumber += 5) > 10));//1

//-------control statements

var myName = "Kokab";
var myFlag = true;
var myOther = null;
console.log("this is myName: " + myName);
console.log("this is myFlag: " + myFlag);
console.log("this is myOther: " + myOther);
console.log(true == myFlag);//true
console.log("this is: " + (true == myFlag));//true
console.log("this is: " + (true === myFlag));//true
console.log("this is: " + (true === myFlag));//true
console.log("this is: " + (null == myOther));//true
console.log("this is: " + (null === myOther));//true


//-------control statements "if"


var myNumber = 5;//two if statements independent of each other
if (myNumber >= 5) {
    console.log(myNumber + "is greater or equal to 5");
}
if (myNumber == 5) {
    console.log(myNumber + " equal to 5");
}

//-------control statements "if else"


var myNumber = 5;//two if statements independent of each other
if (myNumber >= 5) {
    console.log(myNumber + "is greater or equal to 5");
}
else {
    console.log(myNumber + " is  less  5");
}

//-------control statements "if else  if"


var myNumber = 5;//two if statements independent of each other
if (myNumber == 0) {
    console.log(myNumber + "  equal to 0");
}
else if (myNumber > 0) {
    console.log(myNumber + " is  a positive number");
} else if (myNumber < 0) {
    console.log(myNumber + " is  a negative number");
}

var myNumber = "A";//
if (myNumber == 0) {
    console.log(myNumber + "  equal to 0");
}
else if (myNumber > 0) {
    console.log(myNumber + " is  a positive number");
} else if (myNumber < 0) {
    console.log(myNumber + " is  a negative number");
} else {
    console.log(myNumber + " is  not a  number");
}

//-------Switch Statement

var x = 5, y = 4;
var operand = "*";
switch (operand) {
    case '+':
        console.log(x + y);
        break;

    case '-':
        console.log(x - y);
        break;

    case '*':
        console.log(x * y);
        break;

    case '/':
        console.log(x / y);
        break;

    default:
        console.log("invalid operand");
        break;

}

/*ATM Menu Sample
* 1 deposit ==> deposit Amount = $ 1.00
* 2 balancs ==> Account Balance = $ 1.00
* 3 service ==> welcome to ATM services
* 4 exit ==> Thank you for using our services
* 
* Enter option (1-4) : [--]
* Error Message: Invalid option. Valid options are 1-4
*/

//-------if else
var option = 0;
option = 1;
if (option == 1) {
    console.log("deposit Amount = $ 1.00");
} else if (option == 2) {
    console.log("Account Balance = $ 1.00");
} else if (option == 3) {
    console.log("welcome to ATM services");
} else if (option == 4) {
    console.log("Thank you for using our services");
} else {
    console.log("Error Message: Invalid option. Valid options are 1-4");
}


//-----if else with improved version
option = 5;
if ((option > 4) || (option < 1)) {
    console.log("Error Message: Invalid option. Valid options are 1-4");
} else if (option == 1) {
    console.log("Account Balance = $ 1.00");
} else if (option == 2) {
    console.log("Account Balance = $ 1.00");
} else if (option == 3) {
    console.log("welcome to ATM services");
} else if (option == 4) {
    console.log("Thank you for using our services");
} else {
    console.log("Error Message: Invalid option. Valid options are 1-4");
}


//------switch




option = 3;
switch (option) {
    case 1:
        console.log("deposit Amount = $ 1.00");
        break;

    case 2:
        console.log("Account Balance = $ 1.00");
        break;

    case 3:
        console.log("welcome to ATM services");
        break;

    case 4:
        console.log("Thank you for using our services");
        break;

    default:
        console.log("Error Message: Invalid option. Valid options are 1-4");
        break;

}


//---------------while loop

/* Investement Problem
Starting with $10000, how many years until we have atleast $20,000, at 5% interest

The Algorithm

Start with a year  value of 0 and a balance of  $10,000.
2.Repeat the following  steps while the balance is less than $20,000
 3.add one year to year
 4.compute the interest by
 5. add interest to the balance
 6.Report the final year value as the answer.*/

//  1.Start with a year  value of 0 and a balance of  $10,000.
var vYear = 0;
var vBalance = 10000;
var vInterest = 0;
var vRate = 0.10;

//2.Repeat the following  steps while the balance is less than $20,000
while (vBalance < 20000) {
    vYear++; //3.add one year to year
    vInterest = vBalance * vRate;//4.vInterest =vBalance * vRate;
    vBalance *= (1 + vRate);      //5.vBalance += vInterest;
}
//6.Report the final year value as the answer.
console.log("Years:" + vYear);



//-------for loop

for (var index = 0; index <= 10; index++) {
    console.log(index);
}

for (var index = 0; index <= 10; ++index) {
    console.log(index);
}
for (var index = 0; index <= 10; index++); {//semicolon at closing parenthesis,
    //  for this loop has no body. Therefore  it executes until the condition is false and does 
    //not print any of early values.
    console.log(index);

}
//-------hands on slide 41
//1. print all even numbers from 0-100
//2. print all odd numbers from 0-100
//1. print all even numbers from 0-100

//1. print all even numbers from 0-100

for (var vNumber = 0; vNumber <= 100; vNumber += 2) {
    console.log("Even numbers from 1 to 100 are :" + vNumber);
}

//1a. using while loop
var vNumber = 0;
while (vNumber <= 100) {
    console.log(vNumber);
    vNumber += 2;
}

//2. print all odd numbers from 0-100

for (var vNumber = 1; vNumber <= 100; vNumber += 2) {
    console.log("Odd numbers from 1 to 100 are :" + vNumber);
}

//2a. using while loop
var vNumber = 0;
while (vNumber <= 100) {
    console.log(vNumber);
    vNumber += 2;
}

//3. Given a prime number determine if this number is prime : yes or No
//------Solution 1 for loop
//var vNumber = 7;
var vNumber;

for (vNumber = 1; vNumber < 100; vNumber++) {
    var vDivisor = 2;
    var vResult = 0;
    var vPrime = true;

    //for(vDivisor=2; vDivisor<vNumber; vDivisor++){
    //for(vDivisor=2; vPrime==true; vDivisor++){
    for (vDivisor = 2; ((vDivisor < vNumber) && vPrime); vDivisor++) {
        if (vNumber % vDivisor == 0) {
            console.log(vDivisor)
            vPrime = false;

        }
    }

    if (vPrime) {
        console.log(vNumber + " is a prime number");
    } else {
        console.log(vNumber + " is NOT a prime number");
    }
}

//-------while

var vNumber = 7;
var vDivisor = 2;
var vPrime = true;
while ((vDivisor < vNumber) && vPrime) {
    if (vNumber % vDivisor++ == 0) {  //vNumber%vDivisor ==0

        vPrime = false;
    } //vDivisor++
}
if (vPrime) {
    console.log(vNumber + " is a prime number");
}

//4.Print all numbers divisible by 4 and 6 for all numbers within 10 and 100o

for (var number = 10; number <= 100; number++) {
    if ((number % 4 == 0) && (number % 6 == 0)) {
        console.log(number);
    }
}

//------Do While Loop

var inte = 4;//condition is false  but because the body of the do-while loop 
// is executed before the condition, it is executed atleast oncce.
do {
    console.log("printing");
} while (inte < 3);//will print only once

//--------------------------
var j = 1;
do {
    let value = j * 2;
    j++;
    console.log(value);
} while (j <= 5);//will do for j =1 till j =5


