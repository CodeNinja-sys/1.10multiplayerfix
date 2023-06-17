/*
 * Decompiled with CFR 0.150.
 */
public class jl
implements bio {
    private static final bzr d = new boo();
    protected static final dbk a = blg.a.s();
    protected ctg b;
    protected bzr c;
    private int e;

    public jl() {
        this.b(4);
    }

    private static int b(int n2, int n3, int n4) {
        return n3 << 8 | n4 << 4 | n2;
    }

    private void b(int n2) {
        if (n2 == this.e) {
            return;
        }
        this.e = n2;
        if (this.e <= 4) {
            this.e = 4;
            this.c = new cit(this.e, this);
        } else if (this.e <= 8) {
            this.c = new cub(this.e, this);
        } else {
            this.c = d;
            this.e = cmk.d(bfa.w.a());
        }
        this.c.a(a);
        this.b = new ctg(this.e, 4096);
    }

    @Override
    public int a(int n2, dbk dbk2) {
        ctg ctg2 = this.b;
        bzr bzr2 = this.c;
        this.b(n2);
        for (int i2 = 0; i2 < ctg2.b(); ++i2) {
            dbk dbk3 = bzr2.a(ctg2.a(i2));
            if (dbk3 == null) continue;
            this.b(i2, dbk3);
        }
        return this.c.a(dbk2);
    }

    public void a(int n2, int n3, int n4, dbk dbk2) {
        this.b(jl.b(n2, n3, n4), dbk2);
    }

    protected void b(int n2, dbk dbk2) {
        int n3 = this.c.a(dbk2);
        this.b.a(n2, n3);
    }

    public dbk a(int n2, int n3, int n4) {
        return this.a(jl.b(n2, n3, n4));
    }

    protected dbk a(int n2) {
        dbk dbk2 = this.c.a(this.b.a(n2));
        return dbk2 == null ? a : dbk2;
    }

    public void a(si si2) {
        byte by2 = si2.E();
        if (this.e != by2) {
            this.b(by2);
        }
        this.c.a(si2);
        si2.b(this.b.a());
    }

    public void b(si si2) {
        si2.B(this.e);
        this.c.b(si2);
        si2.a(this.b.a());
    }

    public ama a(byte[] arrby, ama ama2) {
        ama ama3 = null;
        for (int i2 = 0; i2 < 4096; ++i2) {
            int n2 = bfa.w.a(this.a(i2));
            int n3 = i2 & 0xF;
            int n4 = i2 >> 8 & 0xF;
            int n5 = i2 >> 4 & 0xF;
            if ((n2 >> 12 & 0xF) != 0) {
                if (ama3 == null) {
                    ama3 = new ama();
                }
                ama3.a(n3, n4, n5, n2 >> 12 & 0xF);
            }
            arrby[i2] = (byte)(n2 >> 4 & 0xFF);
            ama2.a(n3, n4, n5, n2 & 0xF);
        }
        return ama3;
    }

    public void a(byte[] arrby, ama ama2, ama ama3) {
        for (int i2 = 0; i2 < 4096; ++i2) {
            int n2 = i2 & 0xF;
            int n3 = i2 >> 8 & 0xF;
            int n4 = i2 >> 4 & 0xF;
            int n5 = ama3 == null ? 0 : ama3.a(n2, n3, n4);
            int n6 = n5 << 12 | (arrby[i2] & 0xFF) << 4 | ama2.a(n2, n3, n4);
            this.b(i2, (dbk)bfa.w.a(n6));
        }
    }

    public int a() {
        return 1 + this.c.a() + si.a(this.b.b()) + this.b.a().length * 8;
    }
}

