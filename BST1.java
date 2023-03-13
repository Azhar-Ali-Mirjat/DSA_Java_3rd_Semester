public class BST1 {


    private Object root;
    private BST1 left,right;
    private int size;
    public BST1(Object root)
    {
        this.root=root;
    }
    public BST1(Object root, BST1 left, BST1 right){
        this.root=root;
        this.left=left;
        this.right=right;
    }
    public void add(BST1 tree,Object data){
        BST1 temp=tree;
        while (true){
            if(temp.root.toString().compareTo(data.toString())>0){
                if(temp.left==null){
                    temp.left=new BST1(data);
                    size++;
                    return;
                }
                temp=temp.left;
            }
            else if(temp.root.toString().compareTo(data.toString())<0){
                if(temp.right==null){
                    temp.right=new BST1(data);
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
        BST1 tree=new BST1("A");
        tree.add(tree,"B");
        tree.add(tree,"C");
        tree.add(tree,"D");
        tree.add(tree,"E");
        tree.add(tree,"F");
        tree.add(tree,"G");
        tree.add(tree,"H");
        tree.add(tree,"I");
        tree.add(tree,"J");
        tree.add(tree,"K");
        tree.add(tree,"L");
        tree.add(tree,"M");
        tree.add(tree,"N");
        tree.add(tree,"O");
        tree.add(tree,"P");
        System.out.println("In order: "+tree);
        System.out.println("Pre Order: "+tree.preOrder());
        System.out.println("Post Order: "+tree.postOrder());


    }
}