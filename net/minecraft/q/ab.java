/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

public class ab {
    public static final ab[] a = new ab[16];
    public static final ab b = new ab(0, "default", 1).i();
    public static final ab c = new ab(1, "flat");
    public static final ab d = new ab(2, "largeBiomes");
    public static final ab e = new ab(3, "amplified").j();
    public static final ab f = new ab(4, "customized");
    public static final ab g = new ab(5, "debug_all_block_states");
    public static final ab h = new ab(8, "default_1_1", 0).a(false);
    private final int i;
    private final String j;
    private final int k;
    private boolean l;
    private boolean m;
    private boolean n;

    private ab(int n2, String string) {
        this(n2, string, 0);
    }

    private ab(int n2, String string, int n3) {
        this.j = string;
        this.k = n3;
        this.l = true;
        this.i = n2;
        ab.a[n2] = this;
    }

    public String a() {
        return this.j;
    }

    public String b() {
        return "generator." + this.j;
    }

    public String c() {
        return String.valueOf(this.b()) + ".info";
    }

    public int d() {
        return this.k;
    }

    public ab a(int n2) {
        return this == b && n2 == 0 ? h : this;
    }

    private ab a(boolean bl2) {
        this.l = bl2;
        return this;
    }

    public boolean e() {
        return this.l;
    }

    private ab i() {
        this.m = true;
        return this;
    }

    public boolean f() {
        return this.m;
    }

    public static ab a(String string) {
        ab[] arrab = a;
        int n2 = a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ab ab2 = arrab[i2];
            if (ab2 == null || !ab2.j.equalsIgnoreCase(string)) continue;
            return ab2;
        }
        return null;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return this.n;
    }

    private ab j() {
        this.n = true;
        return this;
    }
}

