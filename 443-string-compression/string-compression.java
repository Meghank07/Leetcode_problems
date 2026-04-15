class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;
        while(read < chars.length){
            char currentchar = chars[read];
            int count = 0;
            while(read < chars.length && chars[read] == currentchar){
                read++;
                count++;
            }
            chars[write] = currentchar;
            write++;
            if(count>1){
                String number = String.valueOf(count);
                for(char c : number.toCharArray()){
                    chars[write] = c;;
                    write++;
                }
            }
        }
        return write;
    }
}