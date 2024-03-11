/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.formatter;

/**
 *
 * @author namdng09
 * @param <E>
 */
public interface IFormatter<E> {
    public String formatTo(E e);
    
    public E formatForm(String e) throws Exception;
}
