import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int a;
    int b;
    int c;
    System.out.println("Ordem crescente!!!!");
    
    System.out.println("Digite três números: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    
    if(a<b && a<c){
        if(b<c)
        System.out.println(a+" "+b+" "+c+" ");
    else
        System.out.println(a+" "+c+" "+b+" ");
    }
    if(b<a && b<c){
        if(a<c)
        System.out.println(b+" "+a+" "+c+" ");
    else
        System.out.println(b+" "+c+" "+a+" ");
    }
    if(c<a && c<b){
        if(a<b)
        System.out.println(c+" "+a+" "+b+" ");
    else
        System.out.println(c+" "+b+" "+a+" ");
    }
    System.out.println("--------------------------------------");
    
    System.out.println("Ordem decrescente!!!!");
    
    System.out.println("Digite três números: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    
    if(a>b && a>c){
        if(b>c)
        System.out.println(a+" "+b+" "+c+" ");
    else
        System.out.println(a+" "+c+" "+b+" ");
    }
    if(b>a && b>c){
        if(a>c)
        System.out.println(b+" "+a+" "+c+" ");
    else
        System.out.println(b+" "+c+" "+a+" ");
    }
    if(c>a && c>b){
        if(a>b)
        System.out.println(c+" "+a+" "+b+" ");
    else
        System.out.println(c+" "+b+" "+a+" ");
    }
    }
}
