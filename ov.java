/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ov {
    private static final Map a = sz.c();

    public static synchronized aig a(File file, int n2, int n3) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
        aig aig2 = (aig)a.get(file3);
        if (aig2 != null) {
            return aig2;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (a.size() >= 256) {
            ov.a();
        }
        aig aig3 = new aig(file3);
        a.put(file3, aig3);
        return aig3;
    }

    public static synchronized void a() {
        for (aig aig2 : a.values()) {
            try {
                if (aig2 == null) continue;
                aig2.a();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        a.clear();
    }

    public static DataInputStream b(File file, int n2, int n3) {
        aig aig2 = ov.a(file, n2, n3);
        return aig2.a(n2 & 0x1F, n3 & 0x1F);
    }

    public static DataOutputStream c(File file, int n2, int n3) {
        aig aig2 = ov.a(file, n2, n3);
        return aig2.b(n2 & 0x1F, n3 & 0x1F);
    }
}

