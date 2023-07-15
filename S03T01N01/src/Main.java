import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Undo undo = Undo.getInstance();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
            System.out.println("Introduce un pedido (add, remove, list, exit): ");
            String input = sc.nextLine();
            
            if(input.equals("add")) {
            	System.out.println("Introduce el nombre del pedido");
            	String pedido = sc.nextLine();
            	undo.addPedido(pedido);
            } else if (input.equals("remove")) {
                undo.removePedido();
            } else if (input.equals("list")) {
                undo.showPedidos();
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("Comando no reconocido.");
            }
		}
		sc.close();
	}

}
