package string;

public class DefangingIPAddress {
	public static void main(String[] args) {
		String address = "1.1.1.1";
		StringBuilder newAddress = new StringBuilder();
		for (int i = 0; i < address.length(); i++) {

			if (address.charAt(i) == '.') {
				newAddress =  newAddress.append("[");
				newAddress = newAddress.append("."); 
				newAddress = newAddress.append("]");
			} else
				newAddress = newAddress.append(address.charAt(i));
		}

		System.out.println(newAddress);
	}
}
