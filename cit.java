/*
 * Decompiled with CFR 0.150.
 */
public class cit
implements bzr {
    private final dbk[] a;
    private final bio b;
    private final int c;
    private int d;

    public cit(int n2, bio bio2) {
        this.a = new dbk[1 << n2];
        this.c = n2;
        this.b = bio2;
    }

    @Override
    public int a(dbk dbk2) {
        int n2;
        for (n2 = 0; n2 < this.d; ++n2) {
            if (this.a[n2] != dbk2) continue;
            return n2;
        }
        if ((n2 = this.d++) < this.a.length) {
            this.a[n2] = dbk2;
            return n2;
        }
        return this.b.a(this.c + 1, dbk2);
    }

    @Override
    public dbk a(int n2) {
        if (n2 >= 0 && n2 < this.d) {
            return this.a[n2];
        }
        return null;
    }

    @Override
    public void a(si si2) {
        this.d = si2.e();
        for (int i2 = 0; i2 < this.d; ++i2) {
            this.a[i2] = (dbk)bfa.w.a(si2.e());
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            si2.d(bfa.w.a(this.a[i2]));
        }
    }

    @Override
    public int a() {
        int n2 = si.a(this.d);
        for (int i2 = 0; i2 < this.d; ++i2) {
            n2 += si.a(bfa.w.a(this.a[i2]));
        }
        return n2;
    }
}

