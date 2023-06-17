/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public enum aty {
    a(0, "cod", 2, 0.1f, 5, 0.6f),
    b(1, "salmon", 2, 0.1f, 6, 0.8f),
    c(2, "clownfish", 1, 0.1f),
    d(3, "pufferfish", 1, 0.1f);

    private static final Map e;
    private final int f;
    private final String g;
    private final int h;
    private final float i;
    private final int j;
    private final float k;
    private boolean l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aty(int n3, float f2, int n4, float f3) {
        void var8_6;
        void var7_5;
        this.f = n3;
        this.g = (String)f2;
        this.h = n4;
        this.i = f3;
        this.j = var7_5;
        this.k = var8_6;
        this.l = true;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aty(int n3, float f2) {
        void var6_4;
        void var5_3;
        this.f = n3;
        this.g = (String)f2;
        this.h = var5_3;
        this.i = var6_4;
        this.j = 0;
        this.k = 0.0f;
        this.l = false;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public float f() {
        return this.k;
    }

    public boolean g() {
        return this.l;
    }

    public static aty a(int n2) {
        aty aty2 = (aty)((Object)e.get(n2));
        if (aty2 == null) {
            return a;
        }
        return aty2;
    }

    public static aty a(bhl bhl2) {
        if (bhl2.a() instanceof bin) {
            return aty.a(bhl2.h());
        }
        return a;
    }

    static {
        e = sz.c();
        for (aty aty2 : aty.values()) {
            e.put(aty2.a(), aty2);
        }
    }
}

