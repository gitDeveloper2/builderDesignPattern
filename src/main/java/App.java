import builder.Account;
import builder.Address;
import builder.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> middleNames= Arrays.asList("jackson","lewis");
    Name name=new Name.Builder().firstName("jackson").middleNames(Arrays.asList("jackson","lewis")).surname("karanja").build();
        Address address= new Address.Builder().city("texas").street("12").houseNumber(12).zipCode("q432sd").build();
        Account account=new Account.Builder().name(name).address(address).id(1231212).email("skdgjskd@gmail.com").build();
        System.out.println(account);
    }
}
