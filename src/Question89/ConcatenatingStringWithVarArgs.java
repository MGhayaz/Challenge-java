package Question89;

public class ConcatenatingStringWithVarArgs {
    public static void main(String[] args) {
        String first = "I am ";
        String second = "Optimus prime ";
        String third = "And i send this message to any surviving autoBots taking refuge among the stars";
        System.out.println(ConcatenateString(first + second + third));

    }
    public static String ConcatenateString(String...inputs){
        StringBuilder superr = new StringBuilder();
        for (String str  : inputs){
            superr.append(str).append(" ");
        }
        return superr.toString();
    }


}
