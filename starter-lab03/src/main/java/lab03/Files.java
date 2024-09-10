package lab03;

import java.util.List;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Files {
    static List<Row> readRows(String file) {
        try {
            InputStream raw = App.class
                .getResourceAsStream("/" + file);
            InputStreamReader rdr = new InputStreamReader(raw);
            BufferedReader buf = new BufferedReader(rdr);
            var lines = buf.lines().toList();
            var ys = new ArrayList<Row>();
            for (var line : lines) {
                var cols = line.split(",");
                var row = new Row(cols[0], cols[1], Double.parseDouble(cols[2]));
                ys.add(row);
            }
            return ys;
        }
        catch (Exception ee) {
            throw new RuntimeException("read failed: " + ee);
        }
    }
}

record Row(String studentName, String assignmentName, double score) {

}
