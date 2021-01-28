
public class LongestPrefix {

	public static String longestCommonPrefix(String[] strs) {
		
		String prefix = strs[0];
		String prefixStr = "";
		int start, end;
		
		for(int i=1; i<strs.length; i++) {
			end = 1;
			start = 0;
			while(end <= prefix.length() && end <= strs[i].length()) {
				if(prefix.substring(start, end).matches((strs[i].substring(start, end)))) {
					prefixStr = prefixStr.concat(prefix.substring(start, end));
					start++;
					end++;
					if(end > prefix.length() || end > strs[i].length()) {
						prefix = prefixStr;
						prefixStr = "";
					}
				}else {
					prefix = prefixStr;
					prefixStr = "";
					end = strs[i].length();
				}
			}
		}
		return prefix;
	}
	
	
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}
}

