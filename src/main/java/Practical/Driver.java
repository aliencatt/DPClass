package Practical;

import java.util.List;

public class Driver {

  static List<Account> list_of_Accounts;

  public static void main(String[] args) {

    Account_Creator account_creator = new Account_Creator();
    List<Account> new_list = account_creator.list_of_accounts();

    for (Account aa : new_list) {
      System.out.println(
          aa.getName() + " " + aa.getId() + " " + aa.getAge() + " " + aa.getAddress());

    }

  }
}
