/**Create a file named usefulFunctions.html.
 *You will be creating all functions inside this file. 
 For each state, only show the result of the function currently being created. 
 However, if you need the functionality of the previous functions, you can use them
 ❏Write a function isNumber that checks if a string is a number. 
 This function takes a string as argument. 
 This string is assumed to have a series of character but no spaces
 ❏input: “23”
 ❏output: true
 ❏Input: “a23”
 ❏output: false
 ❏input: 2j3
 ❏output: false
 * 
 */

 console.log("\n\n**********************Multiplication table******************\n\n");
 let result = function(x){
     let myString = "";
                   for (let i = 1; i<=12; i++){
                      myString += i+ " x " + x+ " = " +(i*x)+ "\n";
                       
                   } return myString;
               }
               console.log(result(3));
    console.log("\n\n**********************IsNumber******************\n\n");
           var isNumber = function(str){
               
                 return /^-{0,1}\d+$/.test(str);
                    }
            
            console.log(isNumber(123));
            console.log(isNumber("123"));
            console.log(isNumber("123abc"));
            console.log(isNumber("1a23"));


 /**Write function covertToNumber that converts a string to a type number. 
  *This function takes a string as argument. 
  This string is assumed to have a series of character that are all numbers
  ❏input: “23”
  ❏output: 23 * 
  */

  console.log("\n\n**********************converter******************\n\n");

  let converter = function(value){
                return Number(value);
            }

            console.log(converter("123"));


/**Write a function smaller  that asks the user to input two integer numbers and prints out
 *  the smaller of the two. If the user inputs something that is not a number,
 *  keep asking them
 * ❏input: “23 34a”
 * ❏re-enter input: “23 34”
 * ❏output: “23” */


 console.log("\n\n**********************Smaller of two numbers******************\n\n");
            let smaller = function(a,b){
                if(a-b<0){
                    return a;
                }else{
                    return b;
                }}

                console.log(smaller(2,3));
                console.log(smaller(23,34));

/**Write a function smaller3 that asks the user to input three integer numbers,
 *  and prints out the smallest of the three.
 * If the user inputs something that is not a number, keep asking them
 * ❏(Hint: There are many possible solutions here.
 *  One possible strategy: Given numbers x, y, and z, you can first compare x and y,
 *  take whichever is smaller and compare it with z.)
 * ❏input: “23 34 12”
 * ❏output: “12” */

console.log("\n\n**********************smaller of 3 numbers******************\n\n");
        let smaller3 = function(a,b,c){
                if(a-b<0 && a-c<0){
                    return a;
                }else if(b-a<0 && b-c<0){
                    return b;
                }else{
                    return c;
                }}

                console.log(smaller3(1,2,3));
                console.log(smaller3(23,34,12));

 console.log("\n\n**********************leap year******************\n\n");
 /*The operator % computes the remainder of the division of x by y. 
 For example, 37 % 10 returns 7, because this is the remainder of 37 when divided by 10
 ❏Write a function leap that asks the user to input an integer representing a year 
 number (1999, 2016, etc.). If the input year is a leap year according to the 
 modern Gregorian calendar, it should print Leap year, otherwise, print Common year. 
 If the user inputs something that is not a number, keep asking them
 ❏In the modern Gregorian calendar, a year is a leap year if it is divisible by 4,
  but century years are not leap years unless they are divisible by 400. 
  Here is the pseudocode:❏if (year is not divisible by 4) then (it is a common year) 
  ❏else if (year is not divisible by 100) then (it is a leap year) 
  ❏else if (year is not divisible by 400) then (it is a common year) 
  ❏else (it is a leap year)
  ❏This means that 2012, 2016, 2020, and 2040 are all leap years. 
  However, the century years 1800, 1900, 2100, 2200, 2300 and 2500 are NOT. 
  Yet, 2000, 2400, 2800 are still leap years.
  ❏Enter year: “2016”
  ❏output: “leap year”
  ❏Enter year: “2017”
  ❏output: “common year”*/ 

            let isLeap = function(year){
                if(year%4!=0){
                    return console.log(year + " : Is a common year");
                }else if(year%4==0){
                     return console.log(year + " : Is a leap year");
                }else if(year%100!=0){
                    return console.log(year + " : Is a leap year");
                }else if(year%400!=0){
                    return console.log(year + " : Is a common year");
                }else{
                     return console.log(year + " : Is a leap year");
                }  }
                
                isLeap(2016);
                isLeap(2017);
                isLeap(1800);
                isLeap(2100);
                isLeap(2000);
                isLeap(2400);
console.log("\n\n**********************month days******************\n\n");
/*❏Write a function month that asks the user to 
input the year and the month (1-12) and 
prints the number of days in that month 
(taking into account leap years)
❏Enter year and Month: “2019 2”
❏output: 28 days*/

                let month = function(year,month){
                    if(year%4==0 && month==2){
                        return console.log("Year :" +year +" month :"+ month + " have 29 days");

                    }else if(year%4!=0 && month==2){
                        return console.log("Year :" +year +" month :"+ month + " have 28 days");
                    }else if(month<=7 && month%2!=0){
                        return console.log("Year :" +year +" month :"+ month + " have 31 days");
                    }else if(month>=8 && month%2==0) {
                            return console.log("Year :" +year +" month :"+ month + " have 31 days");
                    }else{
                        return console.log( "Year :" +year +" month :"+ month + " have 30 days");
                    }

                    }
                month(2016, 2);


