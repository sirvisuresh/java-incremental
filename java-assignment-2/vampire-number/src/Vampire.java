
public class Vampire {


    public boolean equal(String a, String b)
    {
        int[] arr  = new int[10];

        int l = a.length();
        for(int i=0 ; i<l ;i++)
        {
           arr[Character.getNumericValue(a.charAt(i))]++;
        }

        int len = b.length();
        for(int i=0 ; i<len ;i++)
        {
            arr[Character.getNumericValue(b.charAt(i))]--;
        }

        for(int i=0 ; i<10 ; i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }

    public int countDigit(int n)
     {   int digitCount = 0;
         while(n!=0)
         {
             n = n/10;
             digitCount++;
         }
         return digitCount;
     }


     public boolean isVampire(int number)
     {
         int noOfDigit = countDigit(number);
         if(noOfDigit % 2 != 0)
             return false;

         int start = (int)Math.pow(10,(noOfDigit/2)-1);

         for(int i = start ; i*i <= number ; i++)
         {
                   if(number % i == 0 && ( (number/10)%10!=0 || i%10!=0) )
                   {
                       String combined = String.valueOf(i) + String.valueOf(number/i);
                       if(equal(combined,String.valueOf(number)))
                       {
                           return true;
                       }
                   }
         }
         return false;
     }


     public void printVampire()
     {
         int count = 0;
         int i=1;

         while(count!=100)
         {
             if(isVampire(i))
             {
                 System.out.println(i);
                 count++;
             }
             i++;
         }
     }
}
