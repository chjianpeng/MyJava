package com.myCompany.node;

public class NodeDemo {

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();

        first.item = "to";
        second.item = "be";
        third.item = "or";

        first.node = second;
        second.node = third;

    }
}
