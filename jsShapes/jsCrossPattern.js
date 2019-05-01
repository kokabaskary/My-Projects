/**
 * /**------------------Printing Shapes---------------------
 * 
        * Task C. Cross
        * Write a program cross.html that asks the user 
        * to input the shape size, and prints a diagonal cross of that dimension.
        * Example:Input size: 8
        *   Shape:  *      *
                     *    *
                      *  *
                       ** 
                       **
                      *  *
                     *    *
                    *      *
 */ 


        var counter=8;
      for(var i = 1; i<=8; i++){//Outer loop for number of rows
    //    var star = "";
       
        
        for(var j=1;j<=8;j++){//loop for printing diagonal stars
            
            //Inner loop for number of columns
               if(i==j)// || i+j==8)//if numer of column and rows are equal print star
               {
                //   star += "*";
                  process.stdout.write("*");
               }else{
                //   star += " ";
                  process.stdout.write(" ");
               } 
            //end of diagonal for loop
            
        // for(var j=8;j>=0; j--){//loop for printing mirror image of first diagonal
                
                 if(counter==j)// || i+j==8)
               {
                //   star += "*";
                  process.stdout.write("*");
               }else{
                //   star += " ";
                  process.stdout.write(" ");
                    }          
                
         } //end of mirror for loop
            counter--;//in outer loop
            process.stdout.write("\n");
            // console.log(star); 
        //ending of outer for loop
        }

