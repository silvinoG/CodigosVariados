import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int a;
    int b;
    int c;
    int d;
    
    System.out.println("Digite o primeiro numero: ");
    a = sc.nextInt();
    System.out.println("Digite o segundo numero: ");
    b = sc.nextInt();
   System.out.println("Digite o terceiro numero: ");
    c = sc.nextInt();
    System.out.println("Digite o quarto numero: ");
    d = sc.nextInt();
    
    for(int i= 0; i<1; i++)
    
    if(a>b && a>c && a>d){
        System.out.println(a +" é o maior");
    }else if(b>a && b>c && b>d){
        System.out.println(b +" é o maior");
    }else if(c>a && c>b && c>d){
        System.out.println(c +" é o maior");
    }else if(d>a && d>b && d>c){
        System.out.println(d +" é o maior");
    }
    if(a<b && a<c && a<d){
        System.out.println(a +" é o menor");
    }else if(b<a && b<c && b<d){
        System.out.println(b +" é o menor");
    }else if(c<a && c<b && c<d){
        System.out.println(c +" é o menor");
    }else if(d<a && d<b && d<c){
        System.out.println(d +" é o menor");
    }
    }
}
