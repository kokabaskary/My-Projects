var obj = {};
             obj;
             console.log("I am here"); 
             
             
             console.log("------------------object create()-----------------")
            //  var obj = Object.create({x:1, y:2});
             var obj2 = {x:1,y:2};
             var obj1 = Object.create({x:1, y:2});
             console.log(obj.y);
             console.log(obj["x"]);
             console.log(obj.toString());
             
             console.log("------------------object delete-----------------")
             delete obj1.x;
             console.log(obj1.x);
             delete obj1.y;
             console.log(obj1.y);
             delete obj2.x;
             console.log(obj2.x);

             console.log("------------------Iterating object-----------------")

             var book = Object.create({x:1, y:2});
                for( var i in book){
                    console.log("This is the key: " + i);//refering to i key
                    console.log("This is the value: " + book[i]);//refering to book in position i value
                }
                 console.log("------------------Iterating object-----------------")


                var personColor =Object.create({Cathy:"purple", Nilda:"Green", Meg:"Blue"});
                for( var i in personColor){
                    console.log("Name: " + i);//refering to i key
                    console.log("Favourite color: " + personColor[i]);
                    console.log("Name: " + i +" Favourite color: " + personColor[i]);//refering to book in position i value
                }

                console.log("------------------Array Join() slide 35-----------------")

                var a =[1,2,3,4,5,6,7,8,9,10];
               
                
                 var x = a.join();
                console.log("Array.join() Result : " +x);

                var x = a.join(" ");
                console.log("Array.join(\" \") Result : " +x);

                var x = a.join("");
                console.log("Array.join(\"\") Result : " +x);

                var b = new Array(10);
                b.join("-");
                 console.log("Array.join(\"\") Result : " +b);

                 console.log("------------------Array Split() slide 35-----------------")

                var s  ="d u t r w";
                var arr = s.split(" ");
                console.log(arr);

                var s  ="xxxxx,ufffdjfjfj,tffgfghh,rhhdsfgd,wgfdyty";
                var arr = s.split(",");
                console.log(arr);

                var s  ="gfgfdgdf123ggf,dutrw, fsydfdshf123fjiodjf, hffjk123jlsdf";
                var arr = s.split("123");
                console.log(arr);

                 var s  ="xxxxx,ufffdj.fjfj,tffgfghh,rhhd.sfgd,wgf.dyty";
                var arr = s.split(".");
                console.log(arr);

                 var transctionString  ="debit, 100, february, 26";//read line by line
                var transaction = transctionString.split(",");
                console.log("Array Transactions = "+transaction);//if i concatacting in this form javascript will take it as a string
                console.log(transaction);//treats as an array

                 console.log("------------------Array Reverse() slide 36-----------------")

                 var a =[1,2,3,4,5,6,7,8,9,10];
               
                 var x = a.reverse();
                console.log("Array.Reverse Result : " +x);
                console.log(x);

                console.log("------------------Array Sort() slide 37-----------------")

                 var b =[3,111,4,200,50];
                console.log(b);
                 b.sort();//Its sorts alphabetically as it is a string
                console.log("Array.sort() Result : " +b);
                console.log(b);
                b.sort(function(a,b){return a-b});//numerical order
                 console.log(b);

                  b.sort(function(a,b){return b-a});//reverse numerical order
                 console.log(b);

                 console.log("------------------Array Slice() slide 38-----------------")

                var c =[1,2,3,4,5,6,7,8,9,10];
                console.log(c);

                var d = c.slice(0,3);
                console.log(d);

                var d = c.slice(3);
                console.log(d);

                // var d = c.slice(1,-1);
                // console.log(d);

                // var d = c.slice(-3,-2);
                // console.log(d);
                
                console.log("------------------Array Splice() slide 39-----------------")


                var e =[1,2,3,4,5,6,7,8,9,10];
                console.log(e);

                var f = e.splice(4);
                console.log(f);

                var f = e.splice(1,2);
                console.log(d);

                 var f = e.splice(1,1);
                console.log(d);

                // var d = c.slice(1,-1);
                // console.log(d);

                // var d = c.slice(-3,-2);
                // console.log(d);

                var g =[1,2,3,4,5,6];
                console.log(g);

                var h = g.splice(2,0,'a','b');
                console.log(h);

                var h = g.splice(2,2,[1,2],3);
                console.log(h);

                
               
                 console.log("------------------Array forEach() slide 40-----------------")

                var array1 = ['a', 'b', 'c'];

                array1.forEach(function(element){console.log(element);});
                         
                //SYNTAX: arr.forEach(function callback(currentValue [, index [, array]]) {
    //your iterator }[, thisArg]); 

                var data =[1,2,3,4,5,6,7,8,9,10];
                var sum = 0;
                data.forEach(function(value){ sum += value;});
                console.log("The sum is : "+ sum);

                console.log(data);
                data.forEach(function(v,i,a){ a[i] = v+1;});//adding 1 to each element in the array
                console.log(data);
                  
                data.forEach(function(value){ sum += value;});//after adding  1 to each element in the array
                console.log("The sum is : "+ sum);
           
                  console.log("------------------array.map() slide 41-----------------") 
                  
                  var array1 = [1, 4, 9, 16];

                // pass a function to map
                const map1 = array1.map(x => x * 2);

                console.log(map1);
                // expected output: Array [2, 8, 18, 32]


               var f = [1,2,3,4,5,6,7,8,9,10];
               var g = f.map(function(x){return x*x;});
                console.log(f);
               console.log(g);

               var prices = [1,2,3,4,5,6,7,8,9,10];
               var newPrices = prices.map(function(x){return x*1.1;});
                console.log(prices);
               console.log(newPrices);

               console.log("------------------array.filter() slide 42-----------------") 

               
               var prices = [1,2,3,4,5,6,7,8,9,10];
               console.log(prices);
               var lowestPrices =prices.filter(function(x){return ((x<3)||(x>7));});
                console.log(lowestPrices);

               var highAndLowPrices =prices.filter(function(x){return x<3;});
               var everyOther = prices.filter(function(x,i){return i%2==0;});

                console.log(everyOther);
                 console.log(highAndLowPrices);
               //filter skips missing elements in sparse arrays return value is always dense.
               // 
                console.log("------------------array.filter()  sparse slide 42-----------------") 
                var a = [5,4,3,2,1]
            //    var dense = sparse.filter(function(){return true;});// to close gaps in a sparce array 
                // console.log(dense);
               //to close gaps and remove undefined and null elements

                 console.log("------------------array.filter() remove undefined and null  slide 42-----------------") 
                a = a.filter(function(x){return x!== undefined && x!==null;});
               console.log(a); 
               