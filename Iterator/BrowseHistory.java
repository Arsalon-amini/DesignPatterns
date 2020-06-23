package com.codeWithArsalon.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    //private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];
    private int count;

    public void push (String url){
        urls[count++] = url;
        //urls.add(url);
    }

    public String pop(){
        return urls[--count];

//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//
//        return lastUrl;
    }

    public Iterator createIterator(){
        return new ArrayIterator(this);
        //return new ListIterator(this); //current object
    }

    public class ArrayIterator implements Iterator{
        //This child class implements Iterator interface
        //Inherits three abstract methods - boolean hasNext(), T current(), void next()

        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history){
            //this class implements
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

//    public class ListIterator implements Iterator{
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size()); //returns a list of strings, can access .size
//        }
//
//        @Override
//        public Object current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }
}
