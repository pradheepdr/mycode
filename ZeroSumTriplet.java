import java.util.*;
public class ZeroSumTriplet {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringTokenizer st=new StringTokenizer(sc.nextLine());
        int[] a=new int[st.countTokens()];
        for(int i=0;i<a.length;i++)a[i]=Integer.parseInt(st.nextToken());
        ArrayList<String> ans=new ArrayList<>();
        Arrays.sort(a);
        int cnt=0,n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==0){
                        cnt++;
                        ans.add(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
        if(cnt==0)System.out.println("None");
        else for(int i=0;i<ans.size();i++)System.out.println(ans.get(i));
    }
}