import java.lang.reflect.Array;
import java.util.Arrays;

public class Box3 {
    float length;
    float width;
    float height;

    public boolean validate(){ //驗證長寬高都小於Box3規格：23 14 13
        if (length > 23)
            return false;
        else if (width > 14)
            return false;
        else if (height > 13)
            return false;
        else
            return true;
    }

    public Box3(float length, float width, float height) {
        float[] record ={length, width, height};
        Arrays.sort(record); //利用 array 重新排序長寬高
        this.length = record[2];
        this.width = record[1];
        this.height = record[0];
    }
}
