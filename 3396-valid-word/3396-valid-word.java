class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        char arr[]=word.toCharArray();
        int vow=0,cos=0,dig=0;
        String vowels="aeiouAEIOU";
        for(int i=0;i<arr.length;i++)
        {
            if(vowels.contains(Character.toString(arr[i])))
            {
                vow++;
            }
            else if(((arr[i]>=65 && arr[i]<=91) || (arr[i]>=96 && arr[i]<=125)) && !vowels.contains(Character.toString(arr[i])))
            {
                cos++;
            }
            else if(Character.isDigit(arr[i]))
            {
                dig++;
            }
            else
            {
                return false;
            }
        }
        return (vow>=1 && cos>=1);
    }
}