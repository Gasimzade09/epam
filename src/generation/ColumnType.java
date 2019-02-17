package generation;

import java.util.Arrays;

public enum ColumnType {
    INTEGER(0),
    STRING(1),
    DATE(2),
    FLOAT(3);

    private int type;

    ColumnType(int type) {
        this.type = type;
    }

    public static ColumnType getByType(int type) {
        return Arrays.stream(ColumnType.values())
                .filter(c -> c.type == type)
                .findFirst()
                .orElse(null);
//                .orElseThrow(()->new RuntimeException("Some error"));
        //TODO fix logic. Select orElse or orElseThrow
    }
}
