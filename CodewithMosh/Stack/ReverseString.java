import java.util.Stack;

public class ReverseString{
    public static void main(String[] args){
        String str = "alieu";

        Stack<String> output = new Stack<String>();
        String reversed = "";

        for(int i=0; i<str.length(); i++){
            output.push(str.substring(i, i+1));
        }
        
        for(int i=0; i<str.length(); i++){
            reversed += output.pop();
        }

        System.out.println(reversed);
    }
}