public class SB {
    // String builder
    public static void main(String[] args) {
 StringBuilder str = new StringBuilder();
 StringBuilder builder = new StringBuilder("tuhitu");
 builder.deleteCharAt(5);
        System.out.println(builder);
        System.out.println("the length of the string is : "+builder.length());

 for(int i =0; i<26;i++){
     char ch = (char)('a'+i);
     str.append(ch);

 }
        System.out.println(" By use of stringbuilder method : " +str);

    }
}



