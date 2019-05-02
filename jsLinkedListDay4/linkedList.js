/**
 * 
 */

        console.log("\n\n********************LinkedList Slide 30****************8\n\n");

        var LinkedList = function(){
            this.head = null;
            this.size = 0;
            this.addToHead = function(v){
                var node = new Node(v);
                if(this.head===null){// if the list is empty
                    this.head = node;
                    this.size++;

                } else{ //if the list contains one or more nodes
                    node.next = this.head;
                    this.head = node;
                    this.size++;
                
                }
                return;
                // var current = this.head;
                // while(current.next != null){
                //     current = current.next;
                // }
                // current.next = node;
                // this.size++;
            }
        }
        
        var Node = function(v){
            this.value = v;
            this.next = null;
        }

        var booksNumber = new LinkedList();
        booksNumber.addToHead(10);
        booksNumber.addToHead(20);
        booksNumber.addToHead(30);
        booksNumber.addToHead(40);
        booksNumber.addToHead(50);
        console.log(booksNumber);

        
