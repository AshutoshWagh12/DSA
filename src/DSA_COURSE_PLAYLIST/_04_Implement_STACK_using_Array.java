package DSA_COURSE_PLAYLIST;

public class _04_Implement_STACK_using_Array {

    static class stack{  // implementation stack using Array
        int size=4;      //  Fixed size of Array
        int Top=-1;      // Initially stack is Empty / Top(Index) is -1
        int arr[]=new int[size];

        // Insert Elements in Stack using Function [ push ]

        void push(int val){
            if(Top==(size-1)){   // To Check Stack is Full/ Overflow
                System.out.println("Stack is Overflow !! You can not push "+val+" to the Stack");
            }
            else{        // Stack is Not Full/ Overflow push/insert the value
                Top++;
                arr[Top]=val;
                System.out.println(val+" Pushed into Stack ");
            }
        }

        // Deleting the Elements in Stack using Function [ pop ]

        int pop(){
            if(Top==-1){          // To Check Stack is Empty/ Underflow
                System.out.println("Stack is Underflow!! You can not pop to the Stack ");
                return -1;
            }
            else{       // Stack is Not Empty/ Underflow pop/insert the value
                int val=arr[Top];
                Top--;
                return val;
            }
        }

        // Peak the  position of elements in Stack

        int peak(int i){
            int position=Top-i+1;  //position(i)=1; & Top=3; (3-1+1)= 3;
            //  store Top(Index) [3] value at position [1]
            if(position<0){
                System.out.println("Not Valid psition in Stack !!!");
                return -1;
            }
            else{
                return arr[position];
            }
        }

        // Displaying the Elements in Stack

        void display(){
            for(int i=Top;i>=0;i--){  // display Elements in Last in First Out
                System.out.print(arr[i]+" ");  //Elements in  [ LIFO ] Order
            }
        }

    }

    public static void main(String[] args) {

        stack s=new stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        //	s.push(50);
        //	s.push(34);

        System.out.println("\nThe Elements in stack :");
        s.display();

        System.out.println("\n\t"+s.pop()+" :- Popped from stack !!!\n");

        for(int j=1;j<=s.Top+1;j++){  // j(position)=1 This time Top value is Top+1
            System.out.println("The Value at position "+j+" is :"+s.peak(j));
        }

        System.out.println("\nAfter the Elements in stack :");
        s.display();
    }

}
