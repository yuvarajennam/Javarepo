public class Stringbuilder {
    public static void main(String[] args){
        StringBuilder str= new StringBuilder("hello");
        System.out.println(str);
        System.out.println(str.append("123"));
        System.out.println(str);
        str.insert(5,"hii");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
