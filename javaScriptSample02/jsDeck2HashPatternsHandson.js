/**
 * Given the string below:
**************
**************
**************
*****####**
**************
**************
Our task is to find the first # and see how many # follow without no interruption.
 Meaning I should keep looking for # until I find a * or I’m at the end of the string

 */
//--------------this will count all the "#" not only continous
 var inputString = "******#*******\n**************\n*****#********\n*****####**\n**************\n************** ";
 console.log(inputString);

var counter =0;
 for(var i=0; i<inputString.length;i++){
     if(inputString[i]=="#"){
         counter++;
         
     }
    }
    console.log("Number of times  =  "+ counter);

 
//-------------------------------find first  sequence of #'s-----------------
 console.log("----------------------------------------------------------------")
    var inputString = "**************\n**************\n**************\n****#####**\n**************\n************** ";
 console.log(inputString);

var counter =0;
 for(var i=0; i<inputString.length;i++){
     if(inputString[i]=="#"){
         counter++;
         if(inputString[i+1]=="*"){
             break;
         }
         
         
     }
    }
    console.log("Number of times  = "+ counter);

//-------------------------------find   sequence of #'s-----------------
 console.log("----------------------------------------------------------------")
    var inputString = "**************\n***##*********\n**************\n****#####**\n********#####****\n************** ";
 console.log(inputString);

var counter =0;
var sequenceCounter =0;
 for(var i=0; i<inputString.length;i++){
     if(inputString[i]=="#"){
         counter++;
         if(inputString[i+1]=="*"){
             sequenceCounter++;
             console.log("Sequence #: " + sequenceCounter + " .Number of times:  "+ counter);
             counter=0;
         }
         
         
     }
    }
  

//-------------------slide 6 -----------------------------
/*Given the string below:
        **************
        **##*****#**
        *****###****
        **##*#***##
        *****####**
        **#**##*****
Our task is to find the first # and see how many # follow without no interruption. 
Meaning I should keep looking for # until I find a * or I’m at the end of the string.
 Stop only when the you count 4 or more # and print the number of #. If the numbers of continues # are 3 or less continue looking and print 0
*/


    console.log("-------------------Case 3 Slide6---------------------------------------------")
    var inputString = "**************\n"+
                        "**##*****#**\n"+
                        "*****###****\n"+
                        "**##*#***##\n"+
                        "*****####**\n"+
                        "**#**##******";
 console.log(inputString);

var counter =0;
var sequenceCounter =0;
 for(var i=0; i<inputString.length;i++){
     if(inputString[i]=="#"){
         counter++;
         if(inputString[i+1]=="*"){
             if(counter<4){
                 console.log("Number 0")
             }else{
                 console.log("Number = " + counter);
                 break;
             }
             
             counter=0;
         }
         
         
     }
    }

     var myData =new Array(10);
     for(var a =0; a<myData.length; a++){
         myData[a]=1;
         
     }
    console.log(myData);

