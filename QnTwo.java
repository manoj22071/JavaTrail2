package quizTest;

	import java.util.HashMap;
	import java.util.Map;

	public class QnTwo {
	    public int firstUniqChar(String s) {
	        Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
	        for (char c : s.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }
	        for (int i = 0; i < s.length(); i++) {
	            if (frequencyMap.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) {
	        QnTwo solution = new QnTwo();
	        String s = "leetcode";
	        int index = solution.firstUniqChar(s);
	        System.out.println(index);
	    }
	}


