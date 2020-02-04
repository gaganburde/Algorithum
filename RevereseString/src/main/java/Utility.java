

public class Utility {

    public String RevereseString(String inputString)
    {
        String reverseString="";
        char[] charArray=inputString.toCharArray();
      for (char inputchar:charArray)
      {
          reverseString=inputchar+reverseString;
      }
      return  reverseString;
    }

}
