package fila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Osiris
 */
public class Node <T> {
     T data;
    Node next;
    
    Node (T d){
        data = d;
        next = null;
    }
}
