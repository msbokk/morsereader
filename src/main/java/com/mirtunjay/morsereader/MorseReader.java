package com.mirtunjay.morsereader;

import com.mirtunjay.morsereader.tree.MorseTree;
import com.mirtunjay.morsereader.tree.Node;

public class MorseReader {

	private MorseTree morseTree;

	public MorseReader() {
		morseTree = new MorseTree();
	}

	public String translateMorse(String morseCode) {
		// .... . .-.. .-.. --- / .-- --- .-. .-.. -..
		if (morseCode == null) {
			return null;
		}
		String[] tokens = morseCode.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String token : tokens) {
			sb.append(getMorseCharacter(token));
		}
		return sb.toString();
	}

	private char getMorseCharacter(String token) {
		if (token.equals("/")) {
			return ' ';
		} else if (token.replace(".", "").replace("-", "").length() != 0) {
			return '$';
		} else {
			return traverse(token, morseTree.getRoot());
		}

	}

	private char traverse(String token, Node root) {
		Node currentNode = root;
		for (int i = 0; i < token.length(); i++) {
			if (token.charAt(i) == '.') {
				if (currentNode.getLeftNode() == null) {
					return '$';
				}
				currentNode = currentNode.getLeftNode();
			} else {
				if (currentNode.getRightNode() == null) {
					return '$';
				}
				currentNode = currentNode.getRightNode();
			}
		}
		return currentNode.getCharacter();
	}
}
