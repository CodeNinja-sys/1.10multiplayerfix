/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum bmb {
    a("integer"),
    b("hearts");

    private static final Map c;
    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bmb() {
        void var3_1;
        this.d = var3_1;
    }

    public String a() {
        return this.d;
    }

    public static bmb a(String string) {
        bmb bmb2 = (bmb)((Object)c.get(string));
        return bmb2 == null ? a : bmb2;
    }

    static {
        c = sz.c();
        for (bmb bmb2 : bmb.values()) {
            c.put(bmb2.a(), bmb2);
        }
    }
}

