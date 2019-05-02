/**
 * 
 * JAVASCRIPT DAY 3 FUNCTIONS
 */

        console.log("--------------function call slide 11------------")

            function customMessage(pCustom, pTimes){
                for (var i=0; i<pTimes; i++){
                    console.log(pCustom, i);
                    console.log(i,pCustom)
                }
            }
            var vCustom ="OTHER MESSAGE -->";
            var vTimes = 5;
            customMessage(vCustom ,vTimes);

           console.log("--------------function return slide 13------------")
            
           function myJoin(p){
               for(var i in p)
                   console.log(i + ":" + p[i] + "\n");
                }

                var book ={
                    bookName: "Java Script",
                    bookAuthor : "O'Reilly",
                    numberOfPages: 900
                };

                myJoin(book);

                console.log("--------------function return slide 13------------")

                function add(a,b){
                    var c = a+b;
                    return c;
                    }

                var result = add(3,5);
                console.log("The sum of the two numbers is = " +result);

                  console.log("--------------function return slide 13 a------------")
           

           function myJoin(obj){
                    
                    for(var objProperty in obj)
                        console.log(objProperty + ":" +obj[objProperty]+ "\n");
                    
           }

                var person ={
                    firstName: "Luke",
                    lastName : "Adams",
                    age: 23
                };

                var book ={
                    bookTitle: "Java Script",
                    bookAuthor : "O'Reilly",
                    numberOfPages: 900,
                    year : 2012
                };

                console.log("Print Object Person ==>");
                 myJoin(person);

                 console.log("---------------------------\n");
                console.log("Print Object Book ==>");
                 myJoin(book);



                console.log("--------------Hoisting slide 14------------")

                //Hoisting is the idea of Javascript bring all object declarations
                //  (basically any declaration) to the top of the script so they are
                //  declared before they are used


                  person ={//ddeclaring
                    firstName: "Luke",
                    lastName : "Adams",
                    age: 23
                };

                 book ={//declaring
                    bookTitle: "Java Script",
                    bookAuthor : "O'Reilly",
                    numberOfPages: 900,
                    year : 2012
                };

            
                function myJoin(obj){//initializing
                    
                    for(var objProperty in obj)
                        console.log(objProperty + ":" +obj[objProperty]+ "\n");
                        }

               
                console.log("Print Object Person ==>");
                 myJoin(person); //using
                 var person;
                         
                 console.log("---------------------------\n");
                console.log("Print Object Book ==>");
                 myJoin(book);
                 var book;

  console.log("--------------Hoisting slide 15------------")

                //Hoisting is the idea of Javascript bring all object declarations
                //  (basically any declaration) to the top of the script so they are
                //  declared before they are used


                    function myJoin(obj){// 1. initializing first
                    
                    for(var objProperty in obj)
                        console.log(objProperty + ":" +obj[objProperty]+ "\n");
                        }

                 console.log("Print Object Person ==>");
                 myJoin(person); // 2.using the function
                 var person;

                 console.log("---------------------------\n");
                console.log("Print Object Book ==>");
                 myJoin(book);
                 var book;
                 //Again, at the moment of the function call, 
                //  since almost everything is an object in Javascript,
                //  Javascript assumes it is an object and continues to 
                // execute the function call. However, 
                // there is nothing assigned to person at this moment (not even null). Javascript assigns “undefined”, therefore nothing gets printed

              
                  person ={//3.declaring it last
                    firstName: "Luke",
                    lastName : "Adams",
                    age: 23
                };

                 book ={//declaring
                    bookTitle: "Java Script",
                    bookAuthor : "O'Reilly",
                    numberOfPages: 900,
                    year : 2012
                };

            
                function myJoin(obj){//initializing
                    
                    for(var objProperty in obj)
                        console.log(objProperty + ":" +obj[objProperty]+ "\n");
                        }

               
         console.log("--------------function callback slide 16------------")


         var list =[34, 4, 56, 67,12, 43]

         list.forEach(
             function(item, index, arr){
                  console.log(item, arr[index]);
             } );

             console.log("");
        
          list.forEach(
             function(item){
                  console.log(item);
             } );
          

              console.log("--------------function callback slide 17------------")

            //  Callback assigned to a variable

         var sum_of_square = function(a,b){
             return(a*a) + (b*b);
         }

         var result = sum_of_square(2,3);
          console.log(result);
           console.log("");

        //    Callback assigned to an object property

         var sum_of_square ={
             first:0,
             second:0 ,
             square: function(){
                 this.result = ((this.first * this.first)
                 +(this.second*this.second));
                 return this.result;
             }
         }

         sum_of_square.first = 2;
         sum_of_square.second = 3;
         var FR = sum_of_square.square();
         console.log(FR);

         
        console.log("--------------function callback slide 19------------")

         
         var sum_of_square ={
             first:0,
             second:0 ,
             square: function(){
                 this.result = ((this.first * this.first)
                 +(this.second*this.second));
                 return this.result;
             },
        result: 13
            }
         
console.log("--------------function return slide 13 a adding a function------------")
           

           function myJoin(obj){
                    
                    for(var objProperty in obj)
                        console.log(objProperty + ":" +obj[objProperty]+ "\n");
                    
           }

                var person ={
                    firstName: "Luke",
                    lastName : "Adams",
                    age: 23,
                    balance : 100,
                    accountBalancePlusFees : function(){
                        return this.balance*1.05;
                    },
                    result :1
                }
                //  myJoin("This is the person account balance: " +person.accountBalancePlusFees());

                   console.log("--------------function callback slide 20------------")

            //  Callback assigned to a variable

        

         var sum_of_square ={
             first:0,
             second:0 ,
             square: function(){
                 this.result = ((this.first * this.first)
                 +(this.second*this.second));
                 return this.result;
             }
         }

         sum_of_square.first = 2;
         sum_of_square.second = 3;
         var FR = sum_of_square.square();
         console.log(FR);
          console.log(sum_of_square);//printing the object sum_of_square

          console.log("--------------Nested Functions slide 21------------")


          function sum_of_square1(a,b){

            function square(x){return x*x;}
            
            return (square(a)+ square(b));
                }
         var result = sum_of_square1(2,3);
         console.log(result);
        //  console.log(square(a));//as square function is declared inside a function
                                // so it wont be accissable from outside as it is  a local function


      console.log("--------------Date Object slide 28------------")


      var today = new Date();
      console.log(today);
      console.log(today.getDay());

    //   var yesterday =  today.getDate()-1;
    //   console.log(yesterday);
                console.log("Yesterday's day--------");
      var yesterday = new Date();
      yesterday.setDate(today.getDate() - 1);
      console.log(yesterday);

      console.log("Tomorrow's day--------");

      var tomorrow = new Date();
     tomorrow.setDate(today.getDate() + 1);
     console.log(tomorrow);

      var lastYear = new Date();
      today.setFullYear(today.getFullYear() - 1);
      console.log(lastYear);

        console.log("Today's year--------");
            console.log("Today's year: " +today.getFullYear());

        console.log("Today's month--------");
                console.log("Today's month: " +today.getMonth());
        console.log("Today's day--------");
                 console.log("Today's day: " +today.getDate());

                 
      console.log("\n\n\n--------------Regular Expression slide 32,33-----------\n\n\n");
                debugger;
      var text = "JavaScript";
      console.log(text.search(/script/i));
      text = "I love JavaScript, I love JavaScript, I love JavaScript. Yeah!!!!";
      var result = text.replace(/love/gi, "Like");
      var resultA = text.match(/love/gi);
      console.log(text);
      console.log(result);
      console.log(resultA.length);
      console.log(resultA[0]);
      console.log(resultA[1]);
      console.log(resultA[2]);
