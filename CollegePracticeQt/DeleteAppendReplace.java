// Write a program to delete , insert , append , replace in string
public class DeleteAppendReplace {
    public static void main(String[] args) {
        StringBuffer bf =new StringBuffer("Hii the I am Nishu"); 
        bf.delete(4, 7); 
        System.out.println(bf); 
        StringBuffer sf=new StringBuffer("hi  you are  beautiful");
        System.out.println(sf);
        sf.insert(3,"Nishu");
        sf.insert(17,"a");
        System.out.println(sf.toString());
        sf.append(" Girl");
        System.out.println(sf);
        sf.replace(0,2,"hello");
        System.out.println(sf);
    }

    
}
