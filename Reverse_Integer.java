class Solution {
    public int reverse(int x) {
        
        if(x>0)
        {

            String S=Integer.toString(x);
            StringBuilder sb=new StringBuilder(S);
            sb=sb.reverse();
            S=sb.toString();
            double o=(int)(Double.parseDouble(S));
            if(o < (int)(Math.pow(2,31)-1))
                 return  (int)(o);
            else
                return 0;
        }
        
        if(x<0)
            {
                if(x>(-(int)Math.pow(2,31)))
                {
                   
                    x= x*-1;		//Converting negative to positive as we are using StringBuilder.Reverse() 
                    String S=Integer.toString(x);
                    StringBuilder sb=new StringBuilder(S);
                    sb=sb.reverse();
                    S=sb.toString();
                    Double l=(Double.parseDouble(S));
                    if(-l>-(int)(Math.pow(2,31)))
                        return (int)(-l);			//return Negative reverse of the Number
                    else return 0;
                }
            }
                           
        
     
    return 0;}
}



public class Reverse_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution S=new Solution();
		int x=123432;		//Integer to be reversed
		System.out.println(S.reverse(x));
		

	
	}

}

