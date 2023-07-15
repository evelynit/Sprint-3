import java.util.Stack;

public class Undo {

	private static Undo instanciaUnica; //Única instancia de la clase Undo. Campo estático porque pertenece a la clase
	private Stack<String> historial;
	
	//Constructor privado. Las otras clases no pueden crear nuevas instancias de Undo, 
	//tendrán que usar el método getInstace()
	private Undo() { 
		historial = new Stack<>();
	}
	
	/**Singleton: patrón creacional que garantiza que 
	una clase solo tenga una instancia y proporciona un punto de acceso global a ella.
	**/
	
	public static Undo getInstance() {
		if(instanciaUnica == null) {
			instanciaUnica = new Undo(); //Si no existe, la crea (usando el constructor privado)
		}
		
		return instanciaUnica;
	}
	
	public void addPedido(String pedido) {
		historial.push(pedido);
	}
	
	public void removePedido() {
		historial.pop();
	}
	
	public void showPedidos() {
		for (int i = historial.size()-1; i >= 0; i--) {
			System.out.println(historial.get(i));
		}
	}
}
