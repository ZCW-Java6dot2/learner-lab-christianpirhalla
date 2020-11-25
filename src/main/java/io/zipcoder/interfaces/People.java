package io.zipcoder.interfaces;

import com.sun.deploy.util.JVMParameters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    protected List<E> personList;

    public People(){
        personList = new ArrayList<E>();
    }

    public boolean add(E p){
        return personList.add(p);
    }

    public E findById(long id){
        for (E p : personList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public boolean remove(Person person){
        return personList.remove(person);
    }

    public boolean remove(long id){
        for (Person p : personList){
            if (p.getId() == id){
                return this.remove(p);
            }
        }
        return false;
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
