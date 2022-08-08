public class BTS <E extends Comparable<E>> extends AbbtractTree<E>{

    protected TreeNode<E> root;
    protected int size = 0;
    public BTS(){

    }
    public BTS(E[] obj){
        for (int i = 0; i < obj.length; i++) {
            insert(obj[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if (e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);

            }else {
                parent.right = createNewNode(e);
            }

        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public void inorder(){
        inorder(root);
    }

    protected void inorder(TreeNode<E> root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
}
