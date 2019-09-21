package imperative;
import org.omg.PortableServer.POAManagerPackage.State;

import java.util.*;
import java.util.Scanner;

public class PerfectNumber {
    public static Set<Integer> devisors(int n){
        Set<Integer> set = new HashSet<Integer>();
        for (int i=1; i<=n;i++) {
            if(n%i==0){
                set .add(i);
              System.out.println(i);
            }

        }

     return set;
    }
    public static final State PERFECT = null;
    public static final State DEFICIENT = null;
    public static final State ABUNDANT = null;

    public static State process(int n){
          int sum=0;
        Set<Integer> set =devisors(n);
        for (Integer i : set){
         if(i!=n) {
             sum = sum + i;
         }
        }
        System.out.print(sum);
        if(sum<n){
            System.out.println("deficient");
            return DEFICIENT;
        }
        if (sum == n) {
            System.out.println("perfect");
            return PERFECT;
        }
        if (sum > n) {
            System.out.println("abundant");
            return ABUNDANT;
        }
        else return null;


    }
    public static void main(String[] args) {
        int x=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number to check") ;
        if(sc.hasNextInt()){
            x=sc.nextInt();
      } else{
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();
        process(x);
              }

        }



