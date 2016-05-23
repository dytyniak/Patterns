package Prototype;

public class Solution {
	public static void main(String[] args) {
		Request request = new Request("lordrp", 20, "coder");
		
		while (true)// Online requests
		{
			try {
				Request userRequest = request.clone();
				// Change parameters
				userRequest.setAge(30);
				// Request example
				// search(userRequest)
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
	}
}