package Strings;

public class MaximumOccuringCharacter {
    public static char maxOccuringChar(String str){
        char ans='a';
        char arr[]=str.toCharArray();
        int maxfreq=0, n=str.length(),cnt=0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>maxfreq){
                maxfreq=cnt;
                ans=arr[i];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String str ="Java Java";
        System.out.println("The max occuring character in the string is:"+maxOccuringChar(str));
    }
}
