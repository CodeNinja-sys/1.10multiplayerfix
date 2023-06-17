/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum nc {
    a("open_url", true),
    b("open_file", false),
    c("run_command", true),
    d("suggest_command", true),
    e("change_page", true);

    private static final Map f;
    private final boolean g;
    private final String h;

    /*
     * WARNING - void declaration
     */
    private nc() {
        void var4_2;
        void var3_1;
        this.h = var3_1;
        this.g = var4_2;
    }

    public boolean a() {
        return this.g;
    }

    public String b() {
        return this.h;
    }

    public static nc a(String string) {
        return (nc)((Object)f.get(string));
    }

    static {
        f = sz.c();
        for (nc nc2 : nc.values()) {
            f.put(nc2.b(), nc2);
        }
    }
}

