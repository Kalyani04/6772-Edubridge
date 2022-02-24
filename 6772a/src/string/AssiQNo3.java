// Write a Java program to print after removing duplicates from a given string.

package string;   
import java.util.*;
class AssiQNo3   
{   
  static void removeDuplicates(String str)   
  {     
      LinkedHashSet<Character> set = new LinkedHashSet<>();   
      for(int i=0;i<str.length();i++)   
          set.add(str.charAt(i));   
          
      for(Character ch : set)   
          System.out.print(ch);   
  }   
      

  public static void main(String args[])   
  {   
      String str = "Welcome to Welcome";   
      removeDuplicates(str);   
  }   
}