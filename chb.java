/*
 * Decompiled with CFR 0.150.
 */
public abstract class chb
implements dfs {
    protected int a = -1;
    protected boolean b;
    protected boolean c;
    protected boolean d;
    protected boolean e;

    public void a(boolean bl2, boolean bl3) {
        int n2;
        int n3;
        this.b = bl2;
        this.c = bl3;
        if (bl2) {
            n3 = bl3 ? 9987 : 9729;
            n2 = 9729;
        } else {
            n3 = bl3 ? 9986 : 9728;
            n2 = 9728;
        }
        cja.b(3553, 10241, n3);
        cja.b(3553, 10240, n2);
    }

    @Override
    public void b(boolean bl2, boolean bl3) {
        this.d = this.b;
        this.e = this.c;
        this.a(bl2, bl3);
    }

    @Override
    public void d() {
        this.a(this.d, this.e);
    }

    @Override
    public int aF_() {
        if (this.a == -1) {
            this.a = anq.a();
        }
        return this.a;
    }

    public void e() {
        if (this.a != -1) {
            anq.a(this.a);
            this.a = -1;
        }
    }
}

