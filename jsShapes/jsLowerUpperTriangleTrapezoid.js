/**
 * /**------------------Printing Shapes---------------------
 * 
 * Task D. Lower triangle
 * Write a program lower.html that prints the bottom-left half of a square,
 *  given the side length.
 * Example:Input side length: 6
 * Shape:*
 *       **
 *       ***
 *       ****
 *       *****
 *       ******
 */
        console.log("--------------------lower Triangle--------------------------------"); 
        var length = 6;
        for (var i = 1; i<=length; i++) {//outer for loop for number of rows
        var star = "";
        for (var j = 1; j <= i; j++) {//inner nested for loop for columns
        star += "*"; //to print stars in same line
            }
        console.log(star);
        }
     
       
 /**
         * Task E. Upper triangle
         * Write a program upper.html that prints the top-right half of a square,
         *  given the side length.
         * Example:Input side length: 5
         * 
         * Shape:***** 
         *       **** 
         *       ***   
         *       **
         *       *
  */
        console.log("-----------------------Upper Triangle-----------------------------"); 

         var length = 5;
        for (var i = 1; i<=length; i++) {//outer for loop for number of rows
        var star = "";
        for (var j = length; j>=i; j--) {//inner nested for loop for columns
        star += "*"; //to print stars in same line
            }
        console.log(star);
        }

  /**
   * 
            * Task F. Upside-down trapezoid
            * Write a program trapezoid.html that prints an upside-down trapezoid of given
            *  width and height.
            * However, if the input height is impossibly large for the given width,
            *  then the program should report
            * , Impossible shape!
            * Example 1:Input width: 12
            * Input height: 5
            * 
            * Shape:************ 
            *        **********  
            *         ********   
            *          ******    
            *           ****
            * 
            * Example 2:
            * Input width: 12
            * Input height: 7
            * Impossible shape!
            * Hint:You can start with the number ofspaces = 0;
            * stars = width;On each line, 
            * print that number of spaces followed by that number of stars.
            *  After that, the number of spaces gets incremented by 1
            * , while the number of stars gets decremented by 2:
            * spaces += 1;stars -= 2;
            */
         console.log("-----------------------Upside-Down Trapezoid-----------------------------"); 
            
        var width = 12;
        var height =7;
        for (var i = 1; i<=7; i++) {//outer for loop for number of rows
            var space = 0;
            var star = width;
            for (var j = 2; j <= i; j++) {//inner nested for loop for columns
            space += " "; //to print stars in same line
            }for(var k =5; k>=i; k--){
                star += "*";
            }
            // for(var k =5; k>=i; k--){
            //     star += "*";}
            //     space +=1; star -=2;
        console.log(space,star);
        //console.log(star);
            }
         console.log("-----------------------Upside-Down Trapezoid example 2-----------------------------"); 
      
         for (var i = 1; i<=5; i++) {//outer for loop for number of rows
            var space = "";
            var star = "";
            for (var j = 2; j <= i; j++) {//inner nested for loop for columns
            space += "0"; //to print stars in same line
            }
            for(var k =5; k>=i; k--){
                star += "*";
            }
            // for(var k =5; k>=i; k--){
            //     star += "*";}
         console.log(space,star);}