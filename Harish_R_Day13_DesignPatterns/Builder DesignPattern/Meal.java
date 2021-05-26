import java.util.LinkedList;

public class Meal {
	
		private LinkedList items;
		
		Meal(){
			items=new LinkedList();
		}
		
		public void additem(Item item) {
			items.addLast(item);
			
		}
		
		public double getCost() {
			
			double total=0.0;
			for(int i=0;i<items.size();i++) {
				Item item=(Item)items.get(i);
				 total+=item.price();
			}
			return total;
		}
		
		public void showItem() {
	
			for(int i=0;i<items.size();i++) {
				Item item=(Item)items.get(i);
				System.out.println("Item:"+item.name()+", Packing:"
				+item.packing().pack()+", Price:"+item.price());
			}
		}
}
