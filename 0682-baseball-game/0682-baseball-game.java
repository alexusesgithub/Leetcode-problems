class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String str:operations)
        {
            String wd=str;
            if(wd.equals("C"))
            st.pop();
            else if(wd.equals("D"))
            {
                int val=st.peek()*2;
                st.push(val);
            }
            else if(wd.equals("+"))
            {
                int t1=st.pop();
                int t2=st.peek();
                st.add(t1);
                st.add(t1+t2);
                
            }
            else
            st.add(Integer.parseInt(wd));
        }
        int sum=0;
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        return sum;
    }
}