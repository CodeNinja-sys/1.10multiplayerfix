/*
 * Decompiled with CFR 0.150.
 */
public class aaf {
    public static final aaf[] a = new aaf[16];
    public static final aaf b = new aaf(0, "default", 1).i();
    public static final aaf c = new aaf(1, "flat");
    public static final aaf d = new aaf(2, "largeBiomes");
    public static final aaf e = new aaf(3, "amplified").j();
    public static final aaf f = new aaf(4, "customized");
    public static final aaf g = new aaf(5, "debug_all_block_states");
    public static final aaf h = new aaf(8, "default_1_1", 0).a(false);
    private final int i;
    private final String j;
    private final int k;
    private boolean l;
    private boolean m;
    private boolean n;

    private aaf(int n2, String string) {
        this(n2, string, 0);
    }

    private aaf(int n2, String string, int n3) {
        this.j = string;
        this.k = n3;
        this.l = true;
        this.i = n2;
        aaf.a[n2] = this;
    }

    public String a() {
        return this.j;
    }

    public String b() {
        return "generator." + this.j;
    }

    public String c() {
        return this.b() + ".info";
    }

    public int d() {
        return this.k;
    }

    public aaf a(int n2) {
        if (this == b && n2 == 0) {
            return h;
        }
        return this;
    }

    private aaf a(boolean bl2) {
        this.l = bl2;
        return this;
    }

    public boolean e() {
        return this.l;
    }

    private aaf i() {
        this.m = true;
        return this;
    }

    public boolean f() {
        return this.m;
    }

    public static aaf a(String string) {
        for (aaf aaf2 : a) {
            if (aaf2 == null || !aaf2.j.equalsIgnoreCase(string)) continue;
            return aaf2;
        }
        return null;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return this.n;
    }

    private aaf j() {
        this.n = true;
        return this;
    }
}

