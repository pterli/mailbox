import java.util.Arrays;

public class Box5 {
    float length;
    float width;
    float height;

    public boolean validate(){ //驗證長寬高都小於Box5規格：39.5 27.5 23
        if (length > 39.5)
            return false;
        else if (width > 27.5)
            return false;
        else if (height > 23)
            return false;
        else
            return true;
    }

    public Box5(float length, float width, float height) {
        float[] record = {length, width, height};
        Arrays.sort(record); //利用 array 重新排序長寬高
        this.length = record[2];
        this.width = record[1];
        this.height = record[0];
    }
}
