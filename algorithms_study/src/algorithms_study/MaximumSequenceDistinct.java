package algorithms_study;

import java.util.HashSet;

public class MaximumSequenceDistinct {

	public static class Tree {
		public int x;
		public Tree left;
		public Tree right;

		public Tree(int x, Tree left, Tree right) {
			this.x = x;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {
		Tree t = new Tree(4, new Tree(5, new Tree(3, new Tree(4, null, null), new Tree(8, null, null)), null), 
				new Tree(6, new Tree(5, null, null), new Tree(6, null, null)));
		System.out.println(countRight(t));
		
	}


	public static int countRight(Tree t) {

		int count = 0;
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(t.x);
		count++;
		Tree root = t;
		boolean subsequence = true;
		while (root != null && subsequence) {
			if (root.left != null && !numbers.contains(root.left.x)) {
				numbers.add(t.left.x);
				count++;
				root = root.left;
			} else if (root.right != null && !numbers.contains(root.right.x)) {
				numbers.add(t.right.x);
				count++;
				root = root.right;
			} else {
				subsequence = false;
			}
		}

		return count;
	}

}
