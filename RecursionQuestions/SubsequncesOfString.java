// import java.util.*;
public class SubsequncesOfString {
// static void solve(int i, String s, String f) {
// 	if (i == s.length()) {
// 		System.out.print(f+" ");
// 		return;
// 	}
// 	//picking 
// 	//f = f + s.charAt(i);
// 	solve(i + 1, s,  f+s.charAt(i));
// 	//poping out while backtracking
// 	//f.pop_back();
// 	solve(i + 1, s,  f);
// }

//kunal kushwaha 
public static void subsequence(String p,String up){
	if(up.isEmpty()){
	System.out.println(p);
	return;
	}
	char ch=up.charAt(0);
	subsequence(p+ch, up.substring(1));
	subsequence(p, up.substring(1));
}
public static void main(String args[]) {
	// String s = "abc";
	// String f = "";
	// System.out.println("All possible subsequences are: ");
	// solve(0, s, f);
	subsequence("", "abc");
}
}

