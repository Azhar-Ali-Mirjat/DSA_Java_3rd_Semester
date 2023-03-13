class BinaryTree{
	Object root;
	BinaryTree left,right;
	int size=0;
	
	public BinaryTree(Object root) {
		this.root=root;
	}
	public BinaryTree(Object root, BinaryTree left, BinaryTree right) {
		this.root=root;
		this.left=left;
		this.right=right;
		
	}
	
	public String inOrder() {
		StringBuffer buff= new StringBuffer();
		
		if (left!=null) buff.append(left.inOrder());
		buff.append(root+",");
		if (right!=null) buff.append(right.inOrder());

		return buff.toString();
	}
	public int size2() {
//		size++;
//		if(right!=null) {
//			size+=right.size2();
//		}
//		if(left!=null) {
//			size+=left.size2();
//		}
//		return size;
		return 1+(left!=null? left.size2(): 0)+(right!=null? right.size2(): 0);
	}
	public String preOrder() {
		StringBuffer buff= new StringBuffer();
		if (root==null)return "Tree does not exist";
		

		buff.append(root+",");
		if (left!=null) {
			buff.append(left.preOrder());
		}
		if (right!=null) {
			buff.append(right.preOrder());
		}

		return buff.toString();
	}
	
	public String postOrder() {
		StringBuffer buff= new StringBuffer();
		
		if (left!=null) buff.append(left.postOrder());
		if (right!=null) buff.append(right.postOrder());
		buff.append(root+",");
		
		return buff.toString();
	}
	
	public Object search(BinaryTree tree, Object target) {
		int index=0;
		if (root==null) {
			System.out.println("Tree Does'not Exist");
		}
		else {
			left.preOrder();
			if (left.preOrder()==target || right.preOrder()==target) {
				return size++;
			}
			if (left.postOrder()==target || right.postOrder()==target) {
				return size++;
			}
			if (left.inOrder()==target || right.inOrder()==target) {
				return size++;
			}
		}
		return index;
	}
	
	public int height(BinaryTree rrrr) {
		int rightheight=0, leftheight=0;
		
		if (rrrr==null) {
			return 0;
		}
		else {
			leftheight=height(rrrr.left);
			rightheight=height(rrrr.right);
		
			if (rightheight>leftheight){
				return rightheight+1;
			}
			else {
				return leftheight+1;
		
			}
		}
	}
	
	public void leaf(BinaryTree treee) {
		if (treee==null) {
			return;
		}
		if (left==null && right==null) {
			System.out.println(root);
			return;
		}
		if (treee.left!=null) { 
			left.leaf(treee);
			System.out.println(treee.left);
		}
		if (treee.right!=null) {
			right.leaf(treee);
			System.out.println(treee.right);
		}
	}
	public void fullTree(BinaryTree tree) {
//		if (condition) {
//			
//		}
	}
	
}

public class Tree {
	public static void main(String[] args) {
//		BinaryTree tree= new BinaryTree("A");
		BinaryTree b1= new BinaryTree("D");
		BinaryTree b2= new BinaryTree("E");
		BinaryTree bmain= new BinaryTree("B", b1,b2);
		BinaryTree f1= new BinaryTree("F");
		BinaryTree cmain= new BinaryTree("C", null, f1);
		BinaryTree root1= new BinaryTree("A",bmain,cmain);
		
		System.out.println(root1.preOrder());
		System.out.println(root1.inOrder());
		System.out.println(root1.postOrder());

		System.out.print("Tree Size is : "+root1.size2());
		
		System.out.println("\nTree Height is : "+root1.height(root1));
		
		root1.leaf(root1);
	
	}
}
