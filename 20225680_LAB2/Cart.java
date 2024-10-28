
public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED =20;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm vào.");
        } else {
            System.out.println("Giỏ hàng gần đầy.");
        }
    }

	 public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i] == disc) {
	                // Di chuyển các phần tử còn lại để lấp vào vị trí bị xóa
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                itemsOrdered[qtyOrdered - 1] = null;  // Xóa phần tử cuối cùng
	                qtyOrdered--;
	                System.out.println("Đĩa đã được xóa khỏi giỏ hàng.");
	                return;
	            }
	        }
	        System.out.println("Đĩa không có trong giỏ hàng.");
	    }

	 public float totalCost() {
	        float total = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            total += (itemsOrdered[i]).getCost();  
	        }
	        return total;
	    } 
}

