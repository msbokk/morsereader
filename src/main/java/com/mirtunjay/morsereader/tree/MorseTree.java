package com.mirtunjay.morsereader.tree;

public class MorseTree {
	private Node u_right_empty = new Node('_');
	private Node r_right_empty = new Node('_');
	private Node o_left_empty = new Node('_');
	private	Node o_right_empty = new Node('_');
	private Node u_right_emp_left_empty= new Node('_');
	private Node z_right_empty= new Node('_');
	private	Node root = new Node('*');
	private Node a = new Node('a');
	private Node b = new Node('b');
	private Node c = new Node('c');
	private Node d = new Node('d');
	private Node e = new Node('e');
	private Node f = new Node('f');
	private Node g = new Node('g');
	private Node h = new Node('h');
	private Node i = new Node('i');
	private Node j = new Node('j');
	private Node k = new Node('k');
	private Node l = new Node('l');
	private Node m = new Node('m');
	private Node n = new Node('n');
	private Node o = new Node('o');
	private Node p = new Node('p');
	private Node q = new Node('q');
	private Node r = new Node('r');
	private Node s = new Node('s');
	private Node t = new Node('t');
	private Node u = new Node('u');
	private Node v = new Node('v');
	private Node w = new Node('w');
	private Node x = new Node('x');
	private Node y = new Node('y');
	private Node z = new Node('z');
	private Node n1 = new Node('1');
	private Node n2 = new Node('2');
	private Node n3 = new Node('3');
	private Node n4 = new Node('4');
	private Node n5 = new Node('5');
	private Node n6 = new Node('6');
	private Node n7 = new Node('7');
	private Node n8 = new Node('8');
	private Node n9 = new Node('9');
	private Node n0 = new Node('0');
	private Node dot = new Node('.');
	private Node comma = new Node(',');
	private Node questionMark = new Node('?');
	private Node plus = new Node('+');
	private Node equalTo = new Node('=');
	private Node forwardSlash = new Node('/');

	public MorseTree() {
		root.setLeftRight(e, t);
		e.setLeftRight(i, a);
		t.setLeftRight(n, m);
		i.setLeftRight(s, u);
		a.setLeftRight(r, w);
		n.setLeftRight(d, k);
		m.setLeftRight(g, o);
		s.setLeftRight(h, v);
		u.setLeftRight(f, u_right_empty);
		r.setLeftRight(l, r_right_empty);
		w.setLeftRight(p, j);
		d.setLeftRight(b, x);
		k.setLeftRight(c, y);
		g.setLeftRight(z, q);
		o.setLeftRight(o_left_empty, o_right_empty);
		h.setLeftRight(n5, n4);
		v.setLeftRight(null, n3);
		u_right_empty.setLeftRight(u_right_emp_left_empty, n2);
		r_right_empty.setLeftRight(plus, null);
		j.setLeftRight(null, n1);
		b.setLeftRight(n6, equalTo);
		x.setLeftRight(forwardSlash, null);
		z.setLeftRight(n7, z_right_empty);
		o_left_empty.setLeftRight(n8, null);
		o_right_empty.setLeftRight(n9, n0);
		u_right_emp_left_empty.setLeftRight(questionMark, null);
		plus.setLeftRight(null, dot);
		z_right_empty.setLeftRight(null, comma);
		
	}

	public Node getRoot() {
		return root;
	}
}
