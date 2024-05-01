
public class potd_2000Prefix_ofWord {

    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<word.length(); i++){
            char currentChar = word.charAt(i);
            res.insert(0, currentChar);
            if(currentChar == ch){
                res.append(word.substring(i+1, word.length()));
                return res.toString();
            }
        }

        return word;        
    }
    
}