/*
 * Decompiled with CFR 0.150.
 */
public class btv
implements ds {
    private cmz a;
    private String[] b;

    public btv() {
    }

    public btv(cmz cmz2, cbg[] arrcbg) {
        this.a = cmz2;
        this.b = new String[]{arrcbg[0].i(), arrcbg[1].i(), arrcbg[2].i(), arrcbg[3].i()};
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
        this.b = new String[4];
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b[i2] = si2.e(384);
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        for (int i2 = 0; i2 < 4; ++i2) {
            si2.a(this.b[i2]);
        }
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cmz a() {
        return this.a;
    }

    public String[] b() {
        return this.b;
    }
}

