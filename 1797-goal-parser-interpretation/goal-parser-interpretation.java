class Solution {
    public String interpret(String command) {
        String ans="";
        int n=command.length();
        for(int i=0;i<n;i++){
            if(command.charAt(i)=='G'){
                ans+="G";
            }
            else if(command.charAt(i)=='('&& command.charAt(i+1)==')'){
                ans+="o";
                i++;
            }
            else{
           ans+="al";
           i=i+3;
        }
        }
      return ans;  
    }
}
