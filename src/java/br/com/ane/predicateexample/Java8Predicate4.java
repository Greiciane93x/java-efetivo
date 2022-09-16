package br.com.ane.predicateexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Predicate4 {

    public static void main(String[] args) {
        Hosting h1 = new Hosting(1, "t1est1", "test1.com");
        Hosting h2 = new Hosting(2, "t2est2", "test2.com");
        Hosting h3 = new Hosting(3, "t3est3", "test3.com");
        Hosting h4 = new Hosting(4, "t4est4", "test4.com");

        List<Hosting> list = Arrays.asList(h1,h2,h3,h4);

        List<Hosting> result = HostingRepository
                .filterHosting(list, x -> x.getName().startsWith("t1"));
        System.out.println("result: " + result);

        List<Hosting> result2 = HostingRepository.filterHosting(list, isDeveloperFriendly());
        System.out.println("result2: " + result2);
    }


    public static Predicate<Hosting> isDeveloperFriendly(){
        return n -> n.getName().equals("t2est2");
    }
}
