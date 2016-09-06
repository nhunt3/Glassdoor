package Zillow.TSTOnline;

public class TernarySearchTreeTest
{
    public static void main(String[] args)
    {
        TernarySearchTree tst = new TernarySearchTree();
        tst.insert("cute");
        tst.insert("cu");
        tst.insert("at");
        tst.insert("as");
        tst.insert("cup");
        tst.insert("he");
        tst.insert("us");
        tst.insert("i");

        System.out.println(tst.toString());
    }
}
