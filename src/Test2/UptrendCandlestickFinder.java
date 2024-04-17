package Test2;
public class UptrendCandlestickFinder {

	public static void UptrendRedCandles(double[] prices) {
		double sum = 0;

		for (int i=0;i<prices.length -1;i++) {

			double open=prices[i];

			double close=prices[i+1];


			if (close<open) {

				double height = open - close;
				System.out.println("Uptrend height  " +height);
				sum=sum+height;
			}
		}

		System.out.println("total "+sum);



	}

	public static void main(String[] args) {


		double[] price = {101.0,96.0,99.0,90.0,88.0,87.0,86.0,82.0};

		UptrendRedCandles(price);
	}
}
