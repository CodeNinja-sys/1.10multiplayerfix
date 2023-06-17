/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.cm;
import com.a.a.d.ov;
import java.util.Collection;

public enum amt implements hn
{
    a(ayx.a, 0, "dandelion"),
    b(ayx.b, 0, "poppy"),
    c(ayx.b, 1, "blue_orchid", "blueOrchid"),
    d(ayx.b, 2, "allium"),
    e(ayx.b, 3, "houstonia"),
    f(ayx.b, 4, "red_tulip", "tulipRed"),
    g(ayx.b, 5, "orange_tulip", "tulipOrange"),
    h(ayx.b, 6, "white_tulip", "tulipWhite"),
    i(ayx.b, 7, "pink_tulip", "tulipPink"),
    j(ayx.b, 8, "oxeye_daisy", "oxeyeDaisy");

    private static final amt[][] k;
    private final ayx l;
    private final int m;
    private final String n;
    private final String o;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private amt(String string) {
        this((String)var1_-1, (int)var2_-1, (ayx)((Object)string), (int)var4_2, (String)var5_3, (String)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private amt(String string, String string2) {
        void var6_4;
        void var5_3;
        this.l = string;
        this.m = (int)string2;
        this.n = var5_3;
        this.o = var6_4;
    }

    public ayx b() {
        return this.l;
    }

    public int c() {
        return this.m;
    }

    public static amt a(ayx ayx2, int n2) {
        amt[] arramt = k[ayx2.ordinal()];
        if (n2 < 0 || n2 >= arramt.length) {
            n2 = 0;
        }
        return arramt[n2];
    }

    public static amt[] a(ayx ayx2) {
        return k[ayx2.ordinal()];
    }

    public String toString() {
        return this.n;
    }

    @Override
    public String a() {
        return this.n;
    }

    public String d() {
        return this.o;
    }

    static {
        k = new amt[ayx.values().length][];
        for (ayx ayx2 : ayx.values()) {
            Collection collection = cm.a((Collection)ov.a(amt.values()), new lh(ayx2));
            amt.k[ayx2.ordinal()] = collection.toArray(new amt[collection.size()]);
        }
    }
}

