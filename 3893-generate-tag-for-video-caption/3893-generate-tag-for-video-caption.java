class Solution {
    public String generateTag(String caption) {
        String[] str = caption.split("\\s+");
        StringBuilder result = new StringBuilder("#");
        for(int i=0;i<str.length;i++){
            String word= str[i].replaceAll("[^A-Za-z]","");
            if(word.isEmpty()) continue;
            if(i==0){
                result.append(word.toLowerCase());
            }
            else{
                result.append(word.substring(0,1).toUpperCase());
                if(word.length()>1){
                    result.append(word.substring(1).toLowerCase());
                }
            }
        }
        String finalResult = result.length()>100 ? result.substring(0,100) : result.toString();
        if (finalResult.length() > 1 && Character.isUpperCase(finalResult.charAt(1))) {
    // Convert character at index 1 to lowercase
    finalResult = finalResult.substring(0, 1) + Character.toLowerCase(finalResult.charAt(1)) + finalResult.substring(2);
}
        return finalResult;
    }
}