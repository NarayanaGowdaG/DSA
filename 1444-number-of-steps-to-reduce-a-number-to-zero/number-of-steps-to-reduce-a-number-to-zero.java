class Solution {
    public int numberOfSteps(int num) {
        int cntstp=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                cntstp++;
            }
            else{
                num=num-1;
                cntstp++;
            }
        }
     return cntstp;   
    }
}