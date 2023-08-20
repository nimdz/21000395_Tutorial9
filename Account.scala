
class Account (val accID:Int,var balance:Double){

  def Deposit(amount:Double): Unit = {
      if(amount>0){
        balance+=amount
        println(s"Deposited:$amount. New Balance:$balance")
      }
    else{
        println("Invalid Amount for deposit")
      }
  }
  def Withdraw(amount:Double): Unit = {
    if(amount>0 && amount<=balance){
      balance-=amount
      println(s"You have withdrawn $amount.New Balance is $balance")
    }
    else{
      println("No sufficent amount to Withdraw")
    }
  }

 def transfer(amount: Double,targetAccount:Account): Unit = {
    if(amount>0 && amount<=balance){
        targetAccount.Deposit(amount)
       println(s"$amount Tranfered")
    }
   else{
      println("Amount cannot be transfer")
    }
 }
}

object  AccountTest{
    def main(args:Array[String]):Unit={
      val account1 = new Account(1, 1000.0)
      val account2 = new Account(2, 500.0)

      println("Initial balances:")
      println(s"Account 1: ${account1.balance}")
      println(s"Account 2: ${account2.balance}")

      account1.Deposit(200.0)
      account2.Withdraw(100.0)

      println("Balances after transactions:")
      println(s"Account 1: ${account1.balance}")
      println(s"Account 2: ${account2.balance}")

      account1.transfer(300.0, account2)

      println("Balances after transfer:")
      println(s"Account 1: ${account1.balance}")
      println(s"Account 2: ${account2.balance}")

  }
}
