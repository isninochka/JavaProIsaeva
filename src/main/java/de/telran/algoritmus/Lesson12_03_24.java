package de.telran.algoritmus;

public class Lesson12_03_24 {

}
class Leaf {
    int value;
    Leaf left;
    Leaf right;

    Leaf(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    Leaf root;

    Tree(int value){
        this.root = new Leaf(value);
    }

    public void addLeaf(int value) {
        Leaf current = this.root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Leaf(value);
                    break;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Leaf(value);
                    break;
                } else current = current.right;
            }
        }
    }
    public boolean hasLeaf(int value) {
        Leaf current = this.root;
        while (true) {
            if (value == current.value) return true;
            else if (value < current.value) {
                if (current.left == null) {
                    return false;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    return false;
                } else current = current.right;
            }
        }
    }
    public void removeLeaf(int value) {
        if (!this.hasLeaf(value))
            throw new Error("We don't have the leaf you're looking for");
        if (value == this.root.value)
            throw new Error("You can't uproot the whole tree");

        Leaf current = this.root;
        while (true) {
            if (value < current.value) {
                if (value == current.left.value) {
                    current.left = null;
                    break;
                } else current = current.left;
            } else {
                if (value == current.right.value) {
                    current.right = null;
                    break;
                } else current = current.right;
            }
        }
    }
    public int count(Leaf leaf) {
        if (leaf == null) return 0;
        return 1 + this.count(leaf.left) + this.count(leaf.right);
    }
    public int countValue(Leaf leaf) {
        if (leaf == null) return 0;
        return leaf.value + this.count(leaf.left) + this.count(leaf.right);
    }
    public int height(Leaf leaf) {
        if (leaf == null) return 0;
        return 1 + Math.max(this.height(leaf.left), this.height(leaf.right));
    }





}


class Main12_03_24 {
    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.addLeaf(12);
        tree.addLeaf(15);
        tree.addLeaf(8);
        tree.addLeaf(0);
        tree.addLeaf(5);
        System.out.println(tree.root.left.left.right.value);
    }


}
