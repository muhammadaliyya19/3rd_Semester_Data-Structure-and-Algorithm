/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLL;

/**
 *
 * @author asus
 */
public class NodeStack {
     //bagian data
    public int NIM;
    public String nama;
    public Object Data; //tipe data yang bisa diisi dengan tipe data apapun

    //bagian pengait
    public NodeStack next = null;
}
