public class NextAlphabeticLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char res = letters[0];
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(letters[mid] == target) {
                start = mid + 1;
            }

            if(letters[mid]-'a' > target-'a'){
                res = letters[mid];
                end = mid - 1;
            }
            if(letters[mid] - 'a' < target - 'a'){
                start = mid + 1;
            }
        }
        return res;
    }
}
