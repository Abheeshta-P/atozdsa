public class Solution {
    public static int dataTypes(String type) {
        // converted it to lower case so that it is not case sensitive
        // conversion can be removed and in cases first letter can be made caps acc to question
        switch(type.toLowerCase()){
            case "integer":
           return 4;
            case "long":
            return 8;
            case "float":
            return 4;
            case "double":
            return 8;
            case "character":
            return 1;
            default:
            return -1;
        }

    }
}