public class StringReverse

    {

        public static void main(String args[])

        {


            String str = "SACHIN TENDULKAR";
            String rev="";

            for (int i=str.length()-1;i>=0;i--){
                char h=str.charAt(i);
                rev+=h;
            }

            System.out.println(rev);

        } 

    }