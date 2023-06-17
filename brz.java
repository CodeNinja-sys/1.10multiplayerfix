/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum brz {
    a("legacy"),
    b("mojang");

    private static final Map c;
    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private brz() {
        void var3_1;
        this.d = var3_1;
    }

    public static brz a(String string) {
        return (brz)((Object)c.get(string.toLowerCase()));
    }

    static {
        c = sz.c();
        for (brz brz2 : brz.values()) {
            c.put(brz2.d, brz2);
        }
    }
}

