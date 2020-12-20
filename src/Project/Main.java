package Project;

public class Main {

    public static void main(String[] args) {
    String s= "abc";
    long n=1000;
    long counter=0;
        for (char a:s.toCharArray()) {
            if (a == 'a') counter ++;
        }

    long factor = n/s.length();
    long modulo = n%s.length();
    counter *=factor;
    for(int i=0;i<modulo;i++){
        if(s.charAt(i)=='a') {
            counter++;
        }
    }
    System.out.println(counter);
    }
}
