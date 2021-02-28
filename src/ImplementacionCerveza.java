import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ImplementacionCerveza extends Implementacion{
	HashMap <Object,Object> map = this.getHash();
	
	
	public void eliminarTodo() {
		map.clear();
	}
	public void eliminarTipo(Object o) {
		Cerveza c = (Cerveza) o;
		map.entrySet().removeIf(e -> ((Cerveza) e.getValue()).getTipo().equals(c.getTipo()));
		
	}
	
	
	public void buscarTipo(Object o) {
		Cerveza c = (Cerveza)o;
		Iterator it = hash.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey()+" "+pair.getValue());
			if (pair.getValue().toString().contains(c.getTipo())) {
				System.out.println(pair.getValue());
			}
		}
		
		
	}
	
	public void contar() {
		System.out.println(map.size());
	}
	
	public void vacia() {
		if (map.isEmpty()) {
			System.out.println("El Hash está vacio");
		}else {
			System.out.println("El Hash tiene elementos guardados");
		}
	}
	
}
