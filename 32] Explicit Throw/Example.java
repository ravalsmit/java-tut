// Explicit throw
// 3. Explicit throw and Implicit catch.
// syntax : throw <throwableInstance>;

//why we throw exception?
     // because we want to set a different message for the exception.
     // beacuse java cannot recognize exceptional situation of our code.

class Example{
     public static void main(String[]args)
     {
          int BALANCE = 5000;
          // int withdrawl = 3000;
          int withdrawl = 8000;
          if(BALANCE < withdrawl)
          {
               throw new ArithmeticException("Insufficient Balance");
          }
          BALANCE = BALANCE - withdrawl;
          System.out.println("Transaction Successful");
          System.out.println("Programs Continues...");
     }
}

// Output:
// 1] withdrawl = 3000
// Transaction Successful
// Programs Continues...

// 2] withdrawl = 8000
// Exception in thread "main" java.lang.ArithmeticException: Insufficient Balance

// 4. Explicit throw and our catch.

class Example{
     public static void main(String[]args)
     {
          int BALANCE = 5000;
          // int withdrawl = 3000;
          int withdrawl = 8000;
          try {
               if(BALANCE < withdrawl)
                    throw new ArithmeticException("Insufficient Balance");
               BALANCE = BALANCE - withdrawl;
               System.out.println("Transaction Successful");
          }
          catch(ArithmeticException e)
          {
               System.out.println("Transaction Failed");
               System.out.println("Exception : "+e.getMessage());
          }
          finally
          {
               System.out.println("Programs Continues...");
          }
     }
}

// Output:
// 1] withdrawl = 3000
// Transaction Successful
// Programs Continues...

// 2] withdrawl = 8000
// Transaction Failed
// Exception : Insufficient Balance
// Programs Continues...