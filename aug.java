/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

public enum aug {
    a("BLACK", '0', 0),
    b("DARK_BLUE", '1', 1),
    c("DARK_GREEN", '2', 2),
    d("DARK_AQUA", '3', 3),
    e("DARK_RED", '4', 4),
    f("DARK_PURPLE", '5', 5),
    g("GOLD", '6', 6),
    h("GRAY", '7', 7),
    i("DARK_GRAY", '8', 8),
    j("BLUE", '9', 9),
    k("GREEN", 'a', 10),
    l("AQUA", 'b', 11),
    m("RED", 'c', 12),
    n("LIGHT_PURPLE", 'd', 13),
    o("YELLOW", 'e', 14),
    p("WHITE", 'f', 15),
    q("OBFUSCATED", 'k', true),
    r("BOLD", 'l', true),
    s("STRIKETHROUGH", 'm', true),
    t("UNDERLINE", 'n', true),
    u("ITALIC", 'o', true),
    v("RESET", 'r', -1);

    private static final Map w;
    private static final Pattern x;
    private final String y;
    private final char z;
    private final boolean A;
    private final String B;
    private final int C;

    private static String c(String string) {
        return string.toLowerCase().replaceAll("[^a-z]", "");
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aug(int n2) {
        this((String)var1_-1, (int)var2_-1, (String)n2, (char)var4_2, false, (int)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aug(boolean bl2) {
        this((String)var1_-1, (int)var2_-1, (String)bl2, (char)var4_2, (boolean)var5_3, -1);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aug(boolean bl2, int n2) {
        void var6_4;
        void var5_3;
        this.y = (String)bl2;
        this.z = (char)n2;
        this.A = var5_3;
        this.C = var6_4;
        this.B = "\u00a7" + (char)n2;
    }

    public int a() {
        return this.C;
    }

    public boolean b() {
        return this.A;
    }

    public boolean c() {
        return !this.A && this != v;
    }

    public String d() {
        return this.name().toLowerCase();
    }

    public String toString() {
        return this.B;
    }

    public static String a(String string) {
        return string == null ? null : x.matcher(string).replaceAll("");
    }

    public static aug b(String string) {
        if (string == null) {
            return null;
        }
        return (aug)((Object)w.get(aug.c(string)));
    }

    public static aug a(int n2) {
        if (n2 < 0) {
            return v;
        }
        for (aug aug2 : aug.values()) {
            if (aug2.a() != n2) continue;
            return aug2;
        }
        return null;
    }

    public static Collection a(boolean bl2, boolean bl3) {
        ArrayList arrayList = ov.a();
        for (aug aug2 : aug.values()) {
            if (aug2.c() && !bl2 || aug2.b() && !bl3) continue;
            arrayList.add(aug2.d());
        }
        return arrayList;
    }

    static {
        w = sz.c();
        x = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-OR]");
        for (aug aug2 : aug.values()) {
            w.put(aug.c(aug2.y), aug2);
        }
    }
}

