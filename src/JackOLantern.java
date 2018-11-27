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
        for(int i = 0; i < this.faceFeatures.length; i++){
            for(int j = 0; j < this.faceFeatures[i].length; j++){
                faceFeatures[i][j] = str;
            }
        }
    }

    @Override
    public String toString() {
        String fullimage = "";
        for(int i = 0; i < this.faceFeatures.length; i++){
            for(int j = 0; j < this.faceFeatures[i].length; j++){
                fullimage += faceFeatures[i][j];
            }
            fullimage += "\n";
        }
        return fullimage;
    }
}
