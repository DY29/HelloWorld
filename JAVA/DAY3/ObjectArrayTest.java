public class ObjectArrayTest {
    public static void main(String args[]){
        String nameList[];
        nameList = new String[3];
        nameList[0] = "Java";
        nameList[1] = "SQL";
        nameList[2] = "Servlet";
//      String nameList = {"Java", "SQL", "Servlet"};
        System.out.println("nameList 길이 = " + nameList.length);
        System.out.println("<nameList 배열 요소 출력>");
        System.out.println(nameList[0] + "\t");
        System.out.println(nameList[1] + "\t");
        System.out.println(nameList[2]);
    }
}
