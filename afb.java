/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum afb {
    a("always", 0),
    b("never", 1),
    c("hideForOtherTeams", 2),
    d("hideForOwnTeam", 3);

    private static final Map g;
    public final String e;
    public final int f;

    public static String[] a() {
        return g.keySet().toArray(new String[g.size()]);
    }

    public static afb a(String string) {
        return (afb)((Object)g.get(string));
    }

    /*
     * WARNING - void declaration
     */
    private afb() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    static {
        g = sz.c();
        for (afb afb2 : afb.values()) {
            g.put(afb2.e, afb2);
        }
    }
}

