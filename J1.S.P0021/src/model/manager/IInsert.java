/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager;

/**
 *
 * @author namdng09
 * @param <E> inserted element type
 */
public interface IInsert<E> {
    /**
     * insert element to list
     * @param e inserted element
     * @throws java.lang.Exception if some specific exception occur when inserting
     */
    public void insert(E e) throws Exception;
}
