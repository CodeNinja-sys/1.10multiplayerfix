/*
 * Decompiled with CFR 0.150.
 */
public class cub
implements bzr {
    private final aww a;
    private final bio b;
    private final int c;

    public cub(int n2, bio bio2) {
        this.c = n2;
        this.b = bio2;
        this.a = new aww(1 << n2);
    }

    @Override
    public int a(dbk dbk2) {
        int n2 = this.a.a(dbk2);
        if (n2 == -1 && (n2 = this.a.b(dbk2)) >= 1 << this.c) {
            n2 = this.b.a(this.c + 1, dbk2);
        }
        return n2;
    }

    @Override
    public dbk a(int n2) {
        return (dbk)this.a.a(n2);
    }

    @Override
    public void a(si si2) {
        this.a.a();
        int n2 = si2.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a.b(bfa.w.a(si2.e()));
        }
    }

    @Override
    public void b(si si2) {
        int n2 = this.a.b();
        si2.d(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            si2.d(bfa.w.a(this.a.a(i2)));
        }
    }

    @Override
    public int a() {
        int n2 = si.a(this.a.b());
        for (int i2 = 0; i2 < this.a.b(); ++i2) {
            n2 += si.a(bfa.w.a(this.a.a(i2)));
        }
        return n2;
    }
}

