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
public interface IIdentify<E> {
    /**
     * check if element is found
     * @param e checked element
     * @return true if element is found, otherwise false
     */
    public boolean isFound(E e);
}
