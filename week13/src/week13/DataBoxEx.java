package week13;

public class DataBoxEx {
	public static void main(String[] args) {
		
		DataBox b1 = new DataBox();
		
		CreatorTh creator = new CreatorTh();
		creator.setDataBox(b1);
		
		ConsumerTh consumer = new ConsumerTh();
		consumer.setDataBox(b1);
		
		
		creator.start();
		consumer.start();
		
		
	}
}
