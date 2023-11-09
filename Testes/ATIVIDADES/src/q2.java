import java.util.Scanner;

public class q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String numeros = sc.nextLine(), nstr = "";
        char ch;
        for(int i = 0; i<numeros.length(); i++)
        {
            ch = numeros.charAt(i);
            if(ch < ch+2){
            nstr = ch + nstr;
            }
        }
        System.out.println(nstr);

        sc.close();
    }
}
