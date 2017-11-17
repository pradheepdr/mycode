import java.util.*;
public class ReplaceString_NextVowel_Consonant {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String vow="aeiou";
char temp=' ';
int num=0;
for(int i=0;i<s.length();i++){
    temp=s.charAt(i);
    num=(int)temp;
    if(vow.indexOf(temp)>=0)
  {
      System.out.print((char)(num+1));
  }
  else{
      int flag=0;
      for(int j=0;j<5;j++){
          if(num<(int)vow.charAt(j)&&flag==0)
            {System.out.print(vow.charAt(j));
            flag=1;
            }
}
	}
}
}