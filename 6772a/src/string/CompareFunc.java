package string;

class CompareFunc {
	public static void main(String args[]) {
		String s1 = "Ajinkya";
		String s2 = "Ajinkya";
		String s3 = "Chaitanya";
		System.out.println(s1.compareTo(s2)); 
		System.out.println(s1.compareTo(s3)); 
		System.out.println(s3.compareTo(s1)); 
	}
}

/*
The String compareTo() method compares values
lexicographically and returns an integer value that describes
if first string is less than, equal to or greater than second
string.

*/