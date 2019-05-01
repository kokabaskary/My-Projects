/**
 * /**------------------Printing Shapes---------------------
 * 
 * Task B.  Checkerboard
 *      Write a program checkerboard.html that asks the user to input width and height and prints a rectangular checkerboard 
 *      of the requested size using asterisks and spaces (alternating).  
 *      
 *         Example:Input width: 11
 *              Input height: 6
 *         
 *          Shape:  * * * * * *
 *                   * * * * *
 *                  * * * * * *
 *                   * * * * *
 *                  * * * * * *
 *                   * * * * *
 *        
 *      Hint:You used nested loops in the previous task that looked probably 
 *          likefor (var row = 0; row < height; row++) 
 *          {for (var col = 0; col < width; col++) {        ...    }}
 * 
 *      inside the loops, you can add an if statement that will be
 *  conditionally printing asterisk * or (space) depending on the 
 * coordinates row and col.Again create the shape inside a string 
 * variable and the print the variable
 */
console.log("-------------------Checkerboard---------------------")


        for(var i = 1; i<=6; i++){//Outer loop for number of rows
            var star = "";
           
                
                for(var j= 1;j<=11;j+=2){//incrementing columns by 2 as we are printing 2 characters in a single column
                //for(var j= 1;j<=Math.ceil(11/2);j+=1){    
                    //Inner loop for number of columns
                    if(i%2==0)
                    {
                        star += " *";
                
                    }else if(i%2==1){
                  star += "* ";
                    }                
                }
                console.log(star);
}//ending of outer for loop
    
   
 