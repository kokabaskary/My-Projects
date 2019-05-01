/** prototype book
 * constructor with paramaters
 * title,author, year, edition,type, description
 * method info to print the properties
 *
 * 
 */
    var Book = function(title, authorFullName, yearPublication){
        this.title = title;
        this.authorFullName = authorFullName;
        this.yearPublication = yearPublication;
        this.description = "";
        this.type = "";
        this.edition = 0;
        this.printBookObject = function(){

            // console.log(this.title, " ," ,this.authorFullName,"," ,this.yearPublication,",", 
            // this.description, ",", this.type, ",", this.edition)//can use either of the 
            console.log(this)
            }
            this.printBookKim = function(){
                for(var prop in this){
                    console.log(prop,"=", this[prop]);//Book.propertyName or Book[propertyName]
                }
            }
    }
    var jsBook = new Book("Intro to Js for all", "Kim", 2019);
    jsBook.printBookObject();


    console.log("\n\n\n**********************\n\n\n");

        var Book = function(title, authorFullName, yearPublication){
        this.title = title;
        this.authorFullName = authorFullName;
        this.yearPublication = yearPublication;
        this.description = "";
        this.type = "";
        this.edition = 0;
        this.printLabel1830 = function(number){
            for(var i=0; i<=number; i++ ){
            console.log("\n***************************\n");
            console.log("   Title :" + this.title);
            console.log("   Author :" + this.authorFullName);
            console.log("    :" + this.yearPublication);
            console.log("   Description :" + this.description);
            console.log("\n***************************\n");
           }          
         }}
    var jsBook = new Book("JavaScript", "Raza", 2019);
          console.log(jsBook.printLabel1830(4));




    // jsBook.printLabel1830();
    
    //  for(var label =1; label<=3; label++){
                // console.log("\n***************************\n");
                // console.log("   " +label);
                // console.log(jsBook.printLabel1830(4));
                // console.log("\n***************************\n");
        //    } 
   

    console.log("\n\n**************slide 6 Prototype*****************************\n\n");

         var simpleObj = function(c){
             this.city = c;
         }
         var live1 = new simpleObj("Brooklyn");
         var live2 = new simpleObj("Bronx");
         live2.state = "New York";
         console.log(live1);
         console.log(live2);
         


          console.log("\n\n***************slide 7 Prototype****************************\n\n");

                   var simpleObj = function(c){
             this.city = c;
         }
         var live1 = new simpleObj("Brooklyn");
         var live2 = new simpleObj("Bronx");
         simpleObj.prototype.state = "New York";
         console.log(live1);
         console.log(live2);
         console.log(live2.prototype === live1.prototype);

         
          console.log("\n\n***************slide 19 closure****************************\n\n");

         var uniqueInteger = function(){//define and invoke
             var counter = 0;//private state of function below
             return function(){ return counter++;}
         }();
         
         console.log(uniqueInteger());
          console.log(uniqueInteger());
          console.log(uniqueInteger());

           console.log("\n\n***************slide 22 closure private variables****************************\n\n");

        function counter(n){//Function argument n is the private variable
            return{
                // property getter method returns and increment private
            get count(){return n++},
            set count(m){//property setter method dosen't allow the value of n to decrese
                            if (m >= n)n=m;
                else throw Error(" Count can only be set to larger value");
                    }
        };
    }

    var c = counter(1000);
    console.log(c.count);// ==> 1000
    console.log(c.count);// ==> 1001
    c.count = 2000;
    console.log(c.count);// ==> 2000
    // c.count =2000 // ==> Error
    c.count = 2001;
    console.log(c.count);

      console.log("\n\n***************slide 22 closure private variables**** Try Catch************************\n\n");

        function counter(n){//Function argument n is the private variable
            return{
                // property getter method returns and increment private
            get count(){return n++},
            set count(m){//property setter method dosen't allow the value of n to decrese
                            if (m >= n)n=m;
                else throw Error(" Count can only be set to larger value");
                    }
        };
    }

    try{
    var c = counter(1000);
    console.log(c.count);// ==> 1000
    console.log(c.count);// ==> 1001
    c.count = 2000;
    console.log(c.count);// ==> 2000
    // c.count =2000 // ==> Error
    c.count = 2001;
    console.log(c.count);
    } catch(Error){
        console.log(Error);
    }