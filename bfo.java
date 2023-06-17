/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum bfo {
    a("always", 0),
    b("never", 1),
    c("pushOtherTeams", 2),
    d("pushOwnTeam", 3);

    private static final Map g;
    public final String e;
    public final int f;

    public static String[] a() {
        return g.keySet().toArray(new String[g.size()]);
    }

    public static bfo a(String string) {
        return (bfo)((Object)g.get(string));
    }

    /*
     * WARNING - void declaration
     */
    private bfo() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    static {
        g = sz.c();
        for (bfo bfo2 : bfo.values()) {
            g.put(bfo2.e, bfo2);
        }
    }
}

