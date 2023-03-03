package QQ39;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCRUD <E> implements InterfaceCRUD<E>
{
	private ArrayList<E> list;
	
	public RepositoryCRUD()
	{
		list = new ArrayList<E>();
	}
	
	public boolean add(E elem)
	{
		return list.add(elem);
	}
	
	public boolean remove(E key)
	{
		return list.remove(key);
	}
	
	public E get(E key)
	{
		int index = list.indexOf(key);
		
		if(index == -1) {
			return null;
		} else {
			return list.get(index);
		}
	}

	public List<E> getList()
	{
		return list;
	}
	
	public boolean edit(E objKey, E objNew)
	{
		int index = list.indexOf(objKey);
		if(index == -1) {
			return false;
		} else {
			list.set(index, objNew);
			return true;
		}
	}
	
}
