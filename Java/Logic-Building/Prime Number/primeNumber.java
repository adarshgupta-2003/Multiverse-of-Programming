public class primeNumber
{
	public static void main(String[] args) {
		int num=15;
		 boolean isPrime = true;
		if(num>2){
		    for(int i=2; i<num; i++ ){
		        if(num%i == 0){
                    isPrime = false;
                    break;
		        }
		    }
		    if(isPrime){
		        System.out.print("prime number");
		    }
		    else{
		        System.out.print("not prime");
		    }
		}
	}
}
