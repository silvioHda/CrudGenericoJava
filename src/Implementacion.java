import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Implementacion implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();

	public HashMap<Object, Object> getHash() {
		return hash;
	}

	public void setHash(HashMap<Object, Object> hash) {
		this.hash = hash;
	}

	@Override
	public void guardar(Object o) {
		// TODO Auto-generated method stub
		Cerveza c = (Cerveza) o;
		hash.put(c.getNombre(), o);
	}

	@Override
	public void editar(Object o) {
		// TODO Auto-generated method stub
		Cerveza c = (Cerveza) o;
		hash.put(c.getNombre(), o);

	}

	@Override
	public void eliminarLave(Object o) {
		// TODO Auto-generated method stub
		Cerveza c = (Cerveza) o;
		hash.remove(c.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}

	@Override
	public Object buscarLlave(Object o) {
		// TODO Auto-generated method stub
		Cerveza c = (Cerveza) o;
		return hash.get(c.getNombre());
	}

}
