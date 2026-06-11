class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String wd=strs[i];
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            String re=new String(a);
            if(!map.containsKey(re))
            {
                 map.put(re,new ArrayList<>());
            }
           map.get(re).add(wd);
            
        }
        return new ArrayList<>(map.values());
    }
}