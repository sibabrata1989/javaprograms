package basicPrograms.String;

public class ConvertAllWordsToCamelCaseFormat {
    public static void main(String[] args) {
        String str = "sibabrata sWAIn Likes to PLAY BAdminton";
        String camelCase = "";
        String firstword ="";
        String[] words = str.split(" ");
        for (int i =1;i<words.length;i++) {
            firstword = words[0].toLowerCase();
            camelCase = camelCase+" "+ Character.toUpperCase(words[i].charAt(0))+words[i].substring(1).toLowerCase();
        }
        System.out.println(firstword+ camelCase);
    }

}
