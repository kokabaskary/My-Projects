package hashMapProblems;

import java.util.HashMap;

public class Share {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mapShare());

	}
	
//	mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
//	mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	//mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	
	public static HashMap<String, String>  mapShare() {
//		String sharemap = null;
		HashMap<String, String> mShare = new HashMap<String, String>();
		mShare.put("a", "aaa");
		mShare.put("b", "bbb");
//		mShare.put("b", "xyz");
		mShare.put("c", "ccc");
		mShare.put("d", "hi");
		
		if(mShare.containsKey("a")) {
			mShare.replace("b", "bbb", "aaa");
			mShare.remove("c", "ccc");
			return mShare;
		}else if(!mShare.containsKey("a")) {
			mShare.remove("c", "ccc");
		}
		return mShare;
	}

}
