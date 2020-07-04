import java.io.*;
class AliceAndString {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        
        int len = 0;
        if(str1.length() == str2.length()){
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)>str2.charAt(i)){
                    len=1;
                    break;
                }
            }
            if(len==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }
    }
}