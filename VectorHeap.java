/*
 * Didier Salazar, 15487	
 * Esteban Avalos, 15059
 * Raul de Leon, 15112
 * HOJA DE TRABAJO 8, ALGORITMOS Y ESTRUCTURA DE DATOS
 */


package hojadetrabajo8;
import java.util.PriorityQueue;
import java.util.Vector;



public class VectorHeap < E extends Comparable<E>> extends PriorityQueue<E>{
	/**
	 * Es un vector que guarda la informacion del VectorHeap  
	 */
	protected Vector<E> datos; // the data, kept in heap order
	
	/**
	 * Constructor que no tiene ningun vector predeterminado  
	 */
	public VectorHeap()
	{
	datos = new Vector<E>();
	}
	/**
	 * 
	 * @param v Vector a convierte a VectorHeap 
	 */public VectorHeap(Vector<E> v)
	{
	int i;
	datos = new Vector<E>(v.size());
	for (i = 0; i < v.size(); i++)
	{ 
	add(v.get(i));
	}
	}
	
	/**
	 *  
	 * @param El parametro i es el nodo del que se necesita conocer su PADRE  
	 * @return PADRE del nodo que esta en la posicion i 
	 */
	protected static int root(int i)
	{
	return (i-1)/2;
	}
	
	/**
	 *
	 * @param El parametro i del nodo que se desea conocer del hijo  
	 * @return La localida que se encuetra el hijo de izquierdo del nodo  
	 */
	protected static int left(int i)
	{
	return 2*i+1;
	}
	
	/**
	 * 
	 * @param El parametro i del nodo que se desea conocer del hijo derechp
	 * @return La localida que se encuetra el hijo de derecho del nodo 
	 */
	protected static int right(int i)
	{
	return 2*(i+1);
	}
}
