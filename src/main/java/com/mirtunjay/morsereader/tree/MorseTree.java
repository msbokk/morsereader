package com.mirtunjay.morsereader.tree;

public class MorseTree {
	Node empty1 = new Node('_');
	Node empty2 = new Node('_');
	Node empty3 = new Node('_');
	Node root = new Node('*');
	Node a = new Node('a');
	Node b = new Node('b');
	Node c = new Node('c');
	Node d = new Node('d');
	Node e = new Node('e');
	Node f = new Node('f');
	Node g = new Node('g');
	Node h = new Node('h');
	Node i = new Node('i');
	Node j = new Node('j');
	Node k = new Node('k');
	Node l = new Node('l');
	Node m = new Node('m');
	Node n = new Node('n');
	Node o = new Node('o');
	Node p = new Node('p');
	Node q = new Node('q');
	Node r = new Node('r');
	Node s = new Node('s');
	Node t = new Node('t');
	Node u = new Node('u');
	Node v = new Node('v');
	Node w = new Node('w');
	Node x = new Node('x');
	Node y = new Node('y');
	Node z = new Node('z');
	Node n1 = new Node('1');
	Node n2 = new Node('2');
	Node n3 = new Node('3');
	Node n4 = new Node('4');
	Node n5 = new Node('5');
	Node n6 = new Node('6');
	Node n7 = new Node('7');
	Node n8 = new Node('8');
	Node n9 = new Node('9');
	Node n0 = new Node('0');
	Node dot = new Node('.');
	Node comma = new Node(',');
	Node questionMark = new Node('?');
	
	public MorseTree() {
		root.setLeftRight(e, t);
		e.setLeftRight(i, a);
		t.setLeftRight(n, m);
		i.setLeftRight(s, u);
		a.setLeftRight(r, w);
		n.setLeftRight(d, k);
		m.setLeftRight(g, o);
		s.setLeftRight(h, v);
		u.setLeftRight(f, empty);
		r.setLeftRight(l, empty);
		
		
	}
}
