/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import com.a.a.d.sz;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import net.minecraft.q.f.a.c;

public class f {
    private static final Map a = sz.c();

    public static synchronized c a(File file, int n2, int n3) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
        c c2 = (c)a.get(file3);
        if (c2 != null) {
            return c2;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (a.size() >= 256) {
            f.a();
        }
        c c3 = new c(file3);
        a.put(file3, c3);
        return c3;
    }

    public static synchronized void a() {
        for (c c2 : a.values()) {
            try {
                if (c2 == null) continue;
                c2.a();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        a.clear();
    }

    public static DataInputStream b(File file, int n2, int n3) {
        c c2 = f.a(file, n2, n3);
        return c2.a(n2 & 0x1F, n3 & 0x1F);
    }

    public static DataOutputStream c(File file, int n2, int n3) {
        c c2 = f.a(file, n2, n3);
        return c2.b(n2 & 0x1F, n3 & 0x1F);
    }
}

