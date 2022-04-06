import java.util.*;
import java.lang.*;

class opr
{
  String str;

  opr()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter String : ");
    str=s.nextLine();
  }

  void uppercase()
  {  
    char strArr[] = str.toCharArray();
    for (int i = 0; i < strArr.length; i++) 
    {    
      if (strArr[i] >= 'a' && strArr[i] <= 'z')
      {
        strArr[i] = (char) ((int) strArr[i] - 32);
      }
    }
    System.out.print("Upper case string is : ");
    for (int i = 0; i < strArr.length; i++) 
    {
      System.out.print(strArr[i]);
    }
  }
  void lowercase()
  {        
    char strArr[] = str.toCharArray();
    for (int i = 0; i < strArr.length; i++) 
    {    
      if (strArr[i] >= 'A' && strArr[i] <= 'Z')
      {
        strArr[i] = (char) ((int) strArr[i] + 32);
      }
    }
    System.out.print("Upper case string is : ");
    for (int i = 0; i < strArr.length; i++) 
    {
      System.out.print(strArr[i]);
    }
  }
  void togglecase()
  {
    char strArr[] = str.toCharArray();
    for (int i = 0; i < strArr.length; i++) 
    {    
      if (strArr[i] >= 'A' && strArr[i] <= 'Z' )
      {
        strArr[i] = (char) ((int) strArr[i] + 32);
      }
      else if (strArr[i] >= 'a' && strArr[i] <= 'z')
      {
        strArr[i] = (char) ((int) strArr[i] - 32);
      }
    }
    System.out.print("Upper case string is : ");
    for (int i = 0; i < strArr.length; i++) 
    {
      System.out.print(strArr[i]);
    }
  }
  void vowelscount()
  {
    int c=0;
    char strArr[] = str.toCharArray();
    for (int i = 0; i < strArr.length; i++) 
    {  
      if(strArr[i]=='A'  strArr[i]=='E'  strArr[i]=='I' strArr[i]=='O'  strArr[i]=='U' || strArr[i]=='u')
      {
        c++;
      }
    }
    System.out.println("Total Vowels is : "+c);
  }

  void titlecase()
  {
    StringBuilder titleCase = new StringBuilder(str.length());
    boolean nextTitleCase = true;

    for (char c : str.toCharArray()) 
    {
      if (Character.isSpaceChar(c)) 
      {
        nextTitleCase = true;
      } 
      else if (nextTitleCase) 
      {
        c = Character.toTitleCase(c);
        nextTitleCase = false;
      }
        titleCase.append(c);
    }
    str=titleCase.toString();
    System.out.println(str);
  }
}

class Stringopr
{
  static int ch;
  public static void main(String []args)
  {
    Scanner s=new Scanner(System.in);
    opr o=new opr();
    do
    {
      
      System.out.println("Press 1 for Upper case String....!");
      System.out.println("Press 2 for Lower case String....!");
      System.out.println("Press 3 for Toggle case String....!");
      System.out.println("Press 4 for Count number of Vowels from String....!");
      System.out.println("Press 5 for Title case String....!");
      System.out.println("Press 0 for Exit....!");

      System.out.println("");
      System.out.print("Enter Your choice :");
      ch=s.nextInt();

      switch (ch)
      {
        case 1:
          System.out.println("");
          o.uppercase();
          break;
        case 2:
          System.out.println("");
          o.lowercase();
          break;
        case 3:
          System.out.println("");
          o.togglecase();
          break;
        case 4:
          System.out.println("");
          o.vowelscount();
          break;
        case 5:
          System.out.println("");
          o.titlecase();
          break;
        case 0:
          break;
      }
    }while(ch!=0);
  }
}