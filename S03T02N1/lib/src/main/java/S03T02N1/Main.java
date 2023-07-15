package S03T02N1;

public class Main {
	public static void main(String[] args) {

        // Creamos el AgenteBolsa
        AgenteBolsa agente = new AgenteBolsa();

        // Creamos dos AgenciasBolsa
        AgenciaBolsa agencia1 = new AgenciaBolsa(agente);
        AgenciaBolsa agencia2 = new AgenciaBolsa(agente);

        // Registramos las agencias con el agente
        agente.registerObserver(agencia1);
        agente.registerObserver(agencia2);

        // Cambiamos los precios 
        agente.setPrices(100.00f, 600.60f, 1000.00f);
        agente.setPrices(150.00f, 600.60f, 1200.00f);
        agente.setPrices(200.00f, 600.60f, 1400.00f);

        // Eliminamos una agencia
        agente.removeObserver(agencia1);

	}
}
