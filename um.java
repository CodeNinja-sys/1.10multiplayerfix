/*
 * Decompiled with CFR 0.150.
 */
public abstract class um {
    protected bnj a;
    protected xy b;
    protected final cyn c = new cyn();
    protected int d;
    protected int e;
    protected int f;
    protected boolean g;
    protected boolean h;
    protected boolean i;

    public void a(bnj bnj2, xy xy2) {
        this.a = bnj2;
        this.b = xy2;
        this.c.a();
        this.d = cmk.d(xy2.bl + 1.0f);
        this.e = cmk.d(xy2.bm + 1.0f);
        this.f = cmk.d(xy2.bl + 1.0f);
    }

    public void b() {
        this.a = null;
        this.b = null;
    }

    protected aqn a(int n2, int n3, int n4) {
        int n5 = aqn.b(n2, n3, n4);
        aqn aqn2 = (aqn)this.c.a(n5);
        if (aqn2 == null) {
            aqn2 = new aqn(n2, n3, n4);
            this.c.a(n5, aqn2);
        }
        return aqn2;
    }

    public abstract aqn a();

    public abstract aqn a(double var1, double var3, double var5);

    public abstract int a(aqn[] var1, aqn var2, aqn var3, float var4);

    public abstract cfh a(bnj var1, int var2, int var3, int var4, xy var5, int var6, int var7, int var8, boolean var9, boolean var10);

    public abstract cfh a(bnj var1, int var2, int var3, int var4);

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }

    public void c(boolean bl2) {
        this.i = bl2;
    }

    public boolean c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }
}

