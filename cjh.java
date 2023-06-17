/*
 * Decompiled with CFR 0.150.
 */
public class cjh
implements ds {
    private String[] a;

    public cjh() {
    }

    public cjh(String[] arrstring) {
        this.a = arrstring;
    }

    @Override
    public void a(si si2) {
        this.a = new String[si2.e()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = si2.e(32767);
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a.length);
        for (String string : this.a) {
            si2.a(string);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public String[] a() {
        return this.a;
    }
}

