
import java.util.Stack;
public class BaseBall {
    public static int Score(char[] arr){
        int sc=0;
        Stack<Integer> stk=new Stack<>();
        for(char ch:arr){
            if(Character.isDigit(ch)){
                stk.push(Character.getNumericValue(ch));
            }
            else if(ch=='C'){
                stk.pop();
            }
            else if(ch=='D'){
                stk.push(stk.peek()+stk.peek());
            }
            else if(ch=='+'){
                int last=stk.pop();
                int seclast=stk.peek();
                stk.push(last);
                stk.push(last+seclast);
            }


        }
        for (int i:stk) {
            sc=sc+i;
        }
        return sc;
    }
    public static void main(String[] args) {
        char []ops = {'5' , '2' , 'C' , 'D' , '+'};
        System.out.println("The score is : " + Score(ops));
    }
    
}
