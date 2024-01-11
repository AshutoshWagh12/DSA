package DSA_COURSE_PLAYLIST;

public class _06_Single_Parenthesis_Match_using_STACK {

    static class stack{

        int size=100;
        int Top=-1;
        char arr[]=new char[size];

        // isEmpty Function

        boolean isEmpty(){
            if(Top==-1){
                return true;   // stack is Empty
            }
            return false;      // stack is Not Empty
        }

        // isfull Function

        int isFull(){
            if(Top==(size-1)){
                return -1;
            }
            return 0;
        }

        // push Function

        void push(char value){
            if(Top==(size-1)){
                System.out.println("Stack OverFlow !! You can not push "+value+" to the Stack");
            }
            else{
                Top++;
                arr[Top]=value;
            }
        }

        // Pop Function

        char pop(){
            if(Top==-1){
                System.out.println("Stack UnderFlow !! You can not pop to the stack");
                return 1;
            }
            else{
                char value=arr[Top];
                Top--;
                return value;
            }
        }
    }
    static boolean check(String exp){
        stack s=new stack();

        char Bracket;

        for(int i=0;i<exp.length();i++){
            Bracket=exp.charAt(i);

            if(Bracket=='('){     // '(' Push into the stack
                s.push(Bracket);
            }
            else if(Bracket==')'){    // ')' pop into the stack but check stack is Already Empty or Not
                if(s.isEmpty()){
                    return false;   // stack is Not Empty Not Balanced Expression
                }
                s.pop();       // ')' pop to the stack
            }
        }
        if(s.isEmpty()){    // In last stack is Empty Expression is Balanced
            return true;
        }
        return false;   // But In last stack is Not Empty Expression is Not Balanced
    }

    public static void main(String[] args) {

        String exp="(((10+2)))";

        if(check(exp)){
            System.out.println("Balanced Expression !!");
        }
        else{
            System.out.println("Not Balanced Expression !!");
        }

    }
}
