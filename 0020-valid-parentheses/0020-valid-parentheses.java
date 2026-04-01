class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            if(ch.equals('(')||ch.equals('[')||ch.equals('{'))
            st.push(ch);
            else
            {
                Character top=st.pop();
                if(ch.equals(')')&&!top.equals('(')||ch.equals(']')&&!top.equals('[')||ch.equals('}')&&!top.equals('{'))
                return false;
                
            }
        }
        return st.isEmpty();
    }
}