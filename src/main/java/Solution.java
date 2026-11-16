public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {
    }
    public boolean endsLy(String x) {
        return x.endsWith("ly");
        } 
    

        
    

    public String conCat(String s1, String s2) {
        if (s1.length(0) || s2.length(0)){
            return s1 + s2;
        }
        
        if (s1.charAt(s1.length()-1) == s2.charAt(0));
         {
            return s1 + s2.substring(1,(s1.length()-1));
         }

         return s1 + s2;

    }

    public String withoutX(String s1) {
        if (s1.charAt(0) == "x"){
            return s1.substring(1);
        }
        if (s1.charAt((s1.length()-1))){
            return s1.substring(0,s1.length()-1);
        }
    }

    public String fizzString(String s1) {
        if (s1.startsWith("f") && s1.endsWith("b")){
            return "FizzBuzz";
        }
        if (s1.endsWith("b")){
            return "Buzz";
        }
        if (s1.startsWith("f")){
            return "Fizz";
        }
    }

    public String fizzString2(int x) {
        if ((x%3) && (x%5)) {
            return "FizzBuzz";

        }
        if (x%3) {
            return "Fizz";
        }
        if (x%5) {
            return "Buzz";
        }
    }
}
