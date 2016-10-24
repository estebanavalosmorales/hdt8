/*
 * Didier Salazar, 15487	
 * Esteban Avalos, 15059
 * Raul de Leon, 15112
 * HOJA DE TRABAJO 8, ALGORITMOS Y ESTRUCTURA DE DATOS
 */

package hojadetrabajo8;

public interface PriorityQueue<E extends Comparable<E>>
{
        /**
	 * Determina si la cola se encuentra vacia 
	 * @return TRUE si esta vacio y FALSE si no 
	 */
	public boolean isEmpty();	
	/**
	 * Regresa el tamaño actual de la cola 
	 * @return Tamano de la cola 
	 */
	public int size();
        /**
	 * Agrega un nuevo elemento a la cola 
	 * @param value Valor que se desea agregar a la cola 
	 */
	public void add(E value);

	
	/**
	 * Elimina todos los elementos de la cola 
	 */
	public void clear();
	// post: removes all elements from queue
	/**
	 *Regresa el primer elemento que se encuetra en la cola 
	 * @return  elemento numero 1 de la cola
	 */
	public E getFirst();

	
	/**
	 * Elimina y retorna el elemento de  menor valor en la cola
	 * @return elemento con el valor mas pequeño de la cola
	 */
	public E remove();

	

}
