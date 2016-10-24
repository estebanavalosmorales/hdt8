/*
 * Didier Salazar, 15487	
 * Esteban Avalos, 15059
 * Raul de Leon, 15112
 * HOJA DE TRABAJO 8, ALGORITMOS Y ESTRUCTURA DE DATOS
 */

package hojadetrabajo8;


import java.util.Vector;


public class VectorHeapIM<E extends Comparable<E>> implements PriorityQueue<E>{

	protected Vector<E> datos; 
	
	/**
	 * Constructor encargado de crear un nuevo VectorHeap Constructor 
	 */
	public VectorHeapIM()
	// post: constructs a new priority queue
	{
		datos = new Vector<E>();
	}
	
	/**
	 * Constructor de la clase. Convierte un vector en un VectorHeap 
	 * @param v Vector que se desea convertir a VectorHeap 
	 */
	public VectorHeapIM(Vector<E> v)
	{
		int i;
		datos = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
			{ 
			add(v.get(i));
			}
	}
		
	@Override
	public E remove() {
		E minVal = getFirst();
		datos.set(0,datos.get(datos.size()-1));
		datos.setSize(datos.size()-1);
		if(datos.size()>1){pushDownRoot(0);};
		return minVal;
	}


	
	@Override
	public boolean isEmpty() {
	
		return false;
	}

	
	@Override
	public int size() {
	
		return datos.size();
	}


	@Override
	public void clear() {
		
	}

	@Override
	public E getFirst() {

		return datos.get(0);
	}
	/** 
	 * @param i Nodo del cual se desea conocer el padre 
	 * @return Padre del Nodo en la posicion i 
	 */
	protected static int root(int i)

	{
		return (i-1)/2;
	}
	
	/** 
	 * @param i Nodo del cual se desea conocer el hijo 
	 * @return Localidad del hijo izquierdo del nodo 
	 */
	protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}
	
	
	/** 
	 * @param i	Nodo del cual se desea conocer el hijo derecho
	 * @return Localidad del hijo derecho del nodo 
	 */
	protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return 2*(i+1);
	}

	
	
	/**
	 * @param root Nodo que se desea mover 
	 */
	protected void pushDownRoot(int root)
	{
		int heapSize = datos.size();
		E value = datos.get(root);
		while (root < heapSize) 
		{
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) && ((datos.get(childpos+1)).compareTo (datos.get(childpos)) < 0))
				{
					childpos++;
				}
				if ((datos.get(childpos)).compareTo (value) < 0)
				{
					datos.set(root,datos.get(childpos));
					root = childpos;
			} else { 
				datos.set(root,value);
				return;
			}
			} else { 
				datos.set(root,value);
				return;
			}
		}
	}

	/**
	 * @param leaf Nodo que debe ser movido 
	 */
	protected void percolateUp(int leaf)
	{
		int parent = root(leaf);
		E value = datos.get(leaf);
		while (leaf > 0 && (value.compareTo(datos.get(parent)) < 0))
		{
			datos.set(leaf,datos.get(parent));
			leaf = parent;
			parent = root(leaf);
		}
		datos.set(leaf,value);
	}

	public void add(E value)

	{
		datos.add(value);
		percolateUp(datos.size()-1);
	}
	

}
