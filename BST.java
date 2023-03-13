public class BST {

    private Object root;
    private BST left,right;
    private int size;
    public BST(Object root)
    {
        this.root=root;
    }
    public BST(Object root,BST left,BST right){
        this.root=root;
        this.left=left;
        this.right=right;
    }
    public void add(BST tree,Object data){
        BST temp=tree;
        while (true){
            if(Integer.parseInt(temp.root.toString())>Integer.parseInt(data.toString())){
                if(temp.left==null){
                    temp.left=new BST(data);
                    size++;
                    return;
                }
                temp=temp.left;
            }
            else if(Integer.parseInt(temp.root.toString())<Integer.parseInt(data.toString())){
                if(temp.right==null){
                    temp.right=new BST(data);
                    size++;
                    return;
                }
                temp=temp.right;
            }
        }

    }
    //In Order Traversing(default case)
    @Override
    public String toString(){
        StringBuilder s=new StringBuilder();
        if(left!=null)s.append(left).append(" ");
        s.append(root).append(" ");
        if(right!=null)s.append(right).append(" ");
        return s+"";
    }
    //pre Order Traversing
    public String preOrder(){
        StringBuilder s=new StringBuilder();
        s.append(root).append(" ");
        if(left!=null)s.append(left.preOrder()).append(" ");
        if(right!=null)s.append(right.preOrder()).append(" ");
        return s+"";
    }

    //Post Order Traversing
    public String postOrder(){
        StringBuilder s=new StringBuilder();
        if(left!=null)s.append(left.postOrder()).append(" ");
        if(right!=null)s.append(right.postOrder()).append(" ");
        s.append(root).append(" ");
        return s+"";
    }
    public static void main(String[] args) {
        //6,8,22,3,7,5,12,10,9,20,35,40,42
        BST tree=new BST(6);
        tree.add(tree,8);
        tree.add(tree,22);
        tree.add(tree,3);
        tree.add(tree,7);
        tree.add(tree,5);
        tree.add(tree,12);
        tree.add(tree,10);
        tree.add(tree,9);
        tree.add(tree,20);
        tree.add(tree,35);
        tree.add(tree,40);
        tree.add(tree,42);
        System.out.println("In order: "+tree);
        System.out.println("Pre Order: "+tree.preOrder());
        System.out.println("Post Order: "+tree.postOrder());


    }
}