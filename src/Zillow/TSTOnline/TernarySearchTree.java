package Zillow.TSTOnline;
import java.util.ArrayList;

class TernarySearchTree
{
    private TSTNode root;
    private ArrayList<String> al;

    /** Constructor **/
    public TernarySearchTree()
    {
        root = null;
    }

    /** function to insert for a word **/
    public void insert(String word)
    {
        //if (root == null)
        root = insert(root, word.toCharArray(), 0);
    }
    /** function to insert for a word **/
    public TSTNode insert(TSTNode r, char[] word, int ptr)
    {
        if (r == null)
            r = new TSTNode(word[ptr]);

        if (word[ptr] < r.data)
            r.left = insert(r.left, word, ptr);
        else if (word[ptr] > r.data)
            r.right = insert(r.right, word, ptr);
        else
        {
            if (ptr + 1 < word.length)
                r.middle = insert(r.middle, word, ptr + 1);
            else
                r.isEnd = true;
        }
        return r;
    }

    /** function to delete a word **/
    public void delete(String word)
    {
        delete(root, word.toCharArray(), 0);
    }
    /** function to delete a word **/
    private void delete(TSTNode r, char[] word, int ptr)
    {
        if (r == null)
            return;

        if (word[ptr] < r.data)
            delete(r.left, word, ptr);
        else if (word[ptr] > r.data)
            delete(r.right, word, ptr);
        else
        {
            /** to delete a word just make isEnd false **/
            if (r.isEnd && ptr == word.length - 1)
                r.isEnd = false;

            else if (ptr + 1 < word.length)
                delete(r.middle, word, ptr + 1);
        }
    }
    /** function to print tree **/
    public String toString()
    {
        al = new ArrayList<String>();
        traverse(root, "");
        return "\nTernary Search Tree : "+ al;
    }
    /** function to traverse tree **/
    private void traverse(TSTNode r, String str)
    {
        if (r != null)
        {
            traverse(r.left, str);

            str = str + r.data;
            if (r.isEnd)
                al.add(str);

            traverse(r.middle, str);
            str = str.substring(0, str.length() - 1);

            traverse(r.right, str);
        }
    }
}
