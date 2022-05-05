package flyweight;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receipt[] receiptList = new Receipt[50];
		ReceiptData[] receiptDataList = new ReceiptData[50];
		
		for(int i = 0; i < 50; i++) {
			receiptList[i] = FlyweightFactory.
					getReceipt(ReceiptType.valueOf("FORMAT" + (i%3+1)));
			receiptDataList[i] = new ReceiptData(100+i);
		}
		
		for(int i = 0; i < 50; i++) {
			receiptList[i].printReceipt(receiptDataList[i]);
		}
		
		FlyweightFactory.getNoReceipts();
	}

}
