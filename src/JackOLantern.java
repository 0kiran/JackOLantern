import java.util.Arrays;

public class JackOLantern {
    private String str;
    private String replace;
    private int row;
    private int column;
    private String[][] faceFeatures;

    public JackOLantern(String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public void fill(String str){
        for(String[] i : faceFeatures){

        }
    }

    @Override
    public String toString() {
        String fullimage = "";
        for (int i = 0, i < )
    }
}
