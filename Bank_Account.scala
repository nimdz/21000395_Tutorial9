class Bank_Account (val id:Int,var balance:Double)

class  Bank_Functions{

  type Bank = List[Bank_Account]

  def filter_negative_accounts(bank:Bank):Bank= {
       bank.filter(_.balance<0)
   }

  def calculate_sum_accounts(bank: Bank):Double={
      bank.map(_.balance).sum
  }

  def apply_intrest(bank: Bank):Bank={
    bank.map{ account =>
      if(account.balance>0) {
        account.balance *= 1.05
      } else {
          account.balance *=1.10
      }
       account
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {

    val bank_Functions = new Bank_Functions()

    val accounts = List (
      new Bank_Account(1, 10000),
      new Bank_Account(2, -1000),
      new Bank_Account(3, 20000),
      new Bank_Account(4, 5000),
      new Bank_Account(5,-2000)
    )

    println("Accounts with negative balances:")
    val negativeBalances = bank_Functions.filter_negative_accounts(accounts)
    negativeBalances.foreach(account => println(s"Account ${account.id}: ${account.balance}"))

    val totalBalance = bank_Functions.calculate_sum_accounts(accounts)
    println(s"Total balance of all accounts: $totalBalance")

    println("Final balances after applying interest:")
    val finalBalances = bank_Functions.apply_intrest(accounts)
    finalBalances.foreach(account => println(s"Account ${account.id}: ${account.balance}"))
  }
}