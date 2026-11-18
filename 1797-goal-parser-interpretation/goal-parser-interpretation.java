class Solution {
    public String interpret(String command) {
        String ans="";
        int n=command.length();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                ans+="G";
            }
            else if(command.startsWith("()", i)){
                ans+="o";
            }
            else if (command.startsWith("(al)", i)) {
           
                    ans+="al";
        }
        }
      return ans;  
    }
}
