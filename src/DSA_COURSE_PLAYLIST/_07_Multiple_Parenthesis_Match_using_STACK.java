package DSA_COURSE_PLAYLIST;

public class _07_Multiple_Parenthesis_Match_using_STACK {

    static class stack{
        int size=100;
        int Top=-1;
        char arr[]=new char[size];

        //  Create functon stack is Empty or Not

        boolean isEmpty(){
            if(Top==-1){
                return true;   // stack is Empty
            }
            return false;      // stack is Not Empty
        }

        // create a functon stack is Full or Not

        int isFull(){
            if(Top==(size-1)){
                return 1;      // stack is Full
            }
            return 0;          // stack is Not full
        }

        // push functon

        void push(char value){
            if(Top==(size-1)){
                System.out.println("Stack OverFlow !!");
            }
            else{
                Top++;
                arr[Top]=value;
            }
        }

        // pop functon

        char pop(){
            if(Top==-1){
                System.out.println("Stack UnderFlow !!");
                return 1;
            }
            else{
                char value=arr[Top];
                Top--;
                return value;
            }
        }

    }

    // Create Match function

    static boolean match(char a,char b){
        if(a=='('&& b==')' || a=='{'&& b=='}' || a=='['&& b==']'){
            return true;    // paranthesis is Match
        }
        return false;       // paranthesis is Not Match
    }

    // To Check paranthesis match or Not

    static boolean MultiParenthesisMatch(String exp){

        stack s=new stack();

        char popped_ch;
        char Bracket;

        for(int i=0;i<exp.length();i++){

            Bracket=exp.charAt(i);

            if(Bracket=='('|| Bracket=='{'|| Bracket=='['){
                s.push(Bracket);
            }
            else if(Bracket==')'||Bracket=='}'||Bracket==']'){
                if(s.isEmpty()){
                    return false;  // Stack is Not Empty Expression is Not Balanced
                }
                popped_ch=s.pop();

                if(!match(popped_ch,Bracket)){ // paranthesis is Not Match (),{},[]
                    return false;     // Not Balanced Expression
                }
            }
        }
        if(s.isEmpty()){
            return true;   // In Last->If the stack is Empty Expression is Balanced
        }
        return false;  // In Last->If the stack is Empty Expression is Not Balanced
    }

    public static void main(String[] args) {

        String exp = "{((10+2)*[6/2])}";

        if(MultiParenthesisMatch(exp)){
            System.out.println("paranthesis is Match !!");
        }
        else{
            System.out.println("paranthesis is Not Match !!");
        }

    }
}
