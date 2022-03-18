package Practical;

import java.util.ArrayList;
import java.util.List;

public class Account_Creator {

  List<Account> accountList;

  public List<Account> list_of_accounts() {
    List<Account> ac = new ArrayList<Account>();
    Account a1 = new Account("Rahul", 1L, 20, "Nagpur");
    Account a2 = new Account("Sameer", 2L, 21, "Pune");
    Account a3 = new Account("Ajay", 3L, 20, "Mumbai");
    Account a4 = new Account("Vijay", 3L, 20, "Mumbai");
    Account a5 = new Account("Swapnil", 3L, 20, "Mumbai");
    Account a6 = new Account("Arjun", 3L, 20, "Mumbai");
    Account a7 = new Account("abc", 3L, 20, "Mumbai");
    Account a8 = new Account("xyz", 3L, 20, "Mumbai");

    ac.add(a1);
    ac.add(a2);
    ac.add(a3);
    ac.add(a4);
    ac.add(a5);
    ac.add(a6);
    ac.add(a7);
    ac.add(a8);

    this.accountList = ac;
    return accountList;
  }

}
