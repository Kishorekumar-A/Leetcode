class Solution {
    public int numberOfSpecialChars(String word) {
        List<Character> li=new ArrayList<>();
        for(char c:word.toCharArray())
        {
            li.add(c);
        }
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char c:word.toCharArray())
        {
            if(Character.isLowerCase(c)&&!set.contains(c))
            {
                char u=Character.toUpperCase(c);
                if(li.contains(u)){
                set.add(c);
                count++;}
            }
        }
        return count;
    }
}