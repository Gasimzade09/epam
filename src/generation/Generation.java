package generation;

import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Random;

public class Generation {
    ColumnType type;
    public static void main(String[] args) {
        Generation gen = new Generation();
        gen.generateCsv(4);
    }

    public void generateCsv(int columnNum){
        HashMap<String, ColumnType> map = new HashMap<>();
//        EnumSet<ColumnType> enumSet = EnumSet.of(ColumnType.String, ColumnType.Integer, ColumnType.Date, ColumnType.Float);
        for (int i = 0; i < columnNum; i++) {
            int num = (int) (Math.random()*10)%3;
            byte[] array = new byte[7]; // length is bounded by 7
            new Random().nextBytes(array);
            String generatedString = new String(array, Charset.forName("UTF-8"));
            map.put(generatedString, ColumnType.getByType(num));
        }



    }
}
