public class JackOLanternRunner {
    public static void main(String[] args){
        String[][] face = new String[5][8];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill(".");
        face1.edit(" ",0,0);
        face1.edit(" ", 4, 7);
        face1.edit(" ", 0 , 7);
        face1.edit(" ", 4, 0);

        face1.edit("9",1,2);
        face1.edit("9",1,5);
        face1.edit("^",2,3);
        face1.edit("^",2,4);
        face1.edit("-",3,1);
        face1.edit("-",3,2);
        face1.edit("T",3,3);
        face1.edit("T",3,4);
        face1.edit("-",3,5);
        face1.edit("-",3,6);
        System.out.println(face1);
    }
}
