package QQ39;

import java.util.List;

public interface InterfaceCRUD <E>
{
	public boolean add(E elem);
	
	public boolean remove(E key);
	
	public E get(E key);
	
	public List<E> getList();
	
	public boolean edit(E objKey, E objNew);
}
