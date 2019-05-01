/**
 * /**------------------Printing Shapes---------------------
 * 
 * Task A.  Box
 *     Write a program box.html that asks the user to input width and height
 *       and prints a solid rectangular box of the requested size using asterisks.
 *      Also, print a line Shape: between user input and the printed shape  
 *      (to separate input from output).
 *         Example:Input width: 7Input height: 4
 * Shape:*******
 *       *******
 *       *******
 *       *******
 *        
 * Hint:●    First, find how to print one row of stars 
 *         (print the asterisk character width times followed by end-of-line).
 *      ●    Then, once you know how to print one line of stars, repeat
 *       it height times (using a loop).
 * ●    Create the shape inside a string variable and then print 
 *      the string variable.
 * 
 * 
 */
 

     console.log("-----------------------Box-----------------------------"); 
   
    var shape ="";
    console.log('Shape:');
    for(var i = 1; i<=4; i++){//Outer loop for number of rows
       var star = "";
        
        for(var j= 1;j<=7;j++){//Inner loop for number of columns
    
        star += "*";
        shape =star; //for printing on same line
        }
         console.log(shape);
   }

   