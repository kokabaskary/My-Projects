/**
 * Java Script Slide 48 arithmetic expression operand and number separator
 */
    var expression = "2456";
    var character ="";
    var numbers="";
    var operands ="";
    const SEPARATOR = "|"
    for(var i=0;i<expression.length;i++){
        console.log(expression[i]);
    character = expression[i];
    if (expression[i]=="+"||
        expression[i]=="-"||
        expression[i]=="*"||
        expression[i]=="/"||
        expression[i]=="^"  ){
        // console.log(" The character is an operand: "+ character);
        operands = operands + character + SEPARATOR;
        numbers +="|";
     }else if(expression[i]>="0"||
              expression[i]<="9"){
               //console.log(" The character is a number: "+ character);   
               numbers += character;  //this will print pipe at the end
                }
            }
            if(numbers[numbers.length-1]!="|"){
                numbers +="|";
                
            }
            console.log("Expression = " + expression);
            console.log("Expression = " + operands);
            console.log("Expression = " + numbers);
console.log("--------------------------------------------------------------");
       var numberA ="2";
       var numberB = 3;
      // var result = numberA + numberB; //dealing it as a string
       //var result = Number(numberA)+ numberB; //converts string  to a number
       var result = parseInt(numberA)+ numberB; //convert string to a number
       console.log(numberA);
       console.log(numberB);
       console.log(result);
     
console.log("--------------------------------------------------------------");

console.log(" Character 2 is = " +expression.charCodeAt(0) +" in ASCII");//to find ASCII code



console.log("------------------slide 19--------------------------------------------");
    var a =[22,23,24,25,26,77,99,76,87,81,98];
    for(let i = 0; i<a.length; i++){
        console.log(a[i]);
    }


    console.log("-----------------------slide 20---------------------------------------");

     var a =[22,23,24,25,26,77,,99,76,87,81,98];//" ,," will print undefined
    for(let i = 0; i<a.length; i++){
        console.log(a[i]);
    }

     console.log("-----------------------slide 21 a---------------------------------------");

/*Two ways of checking for undefined values
First is checking if there is a value of one valid type (not undefined)
Second is checking explicitly for undefined values*/


     var a =[22,23,24,25,26,,77,,99,76,87,81,98];//" ,," will print undefined
    for(let i = 0; i<a.length; i++){
        if(!a[i]){
            continue;
        }
        console.log(a[i]);
    }

    
     console.log("-----------------------slide 21 b---------------------------------------");

     var a =[22,23,24,25,26,,77,,99,76,87,81,98];//" ,," will print undefined
    for(let i = 0; i<a.length; i++){
        if(a[i]===undefined){
            continue;
        }
        console.log(a[i]);
    }

     console.log("-----------------------slide 21 c---------------------------------------");

     var accountTransactions =[1,1,1,1,1,1,1,1,1,1,1];//
     var sum = 0;
    for(let i = 0; i<accountTransactions.length; i++){
        sum += accountTransactions[i];
    }
     console.log("The total is :"+sum);
      console.log("The length of a is =" + accountTransactions.length);
       console.log("The total number of elements in 'accountTransactions' are = " +accountTransactions.length);


        console.log("-----------------------slide 21 d ---------------------------------------");

     var a =[22,23,24,25,26,,77,,99,76,87,81,98];//" ,," will print the sum as the array has undefined values
     var sum = 0;
    for(let i = 0; i<a.length; i++){
        sum += a[i];
    }
     console.log("The total is :"+sum);
      console.log("The length of a is =" + a.length);
       console.log("The total number of elements in 'a' are = " +a.length);