/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;

public class aew
implements ds {
    private int a;
    private byte b;
    private boolean c;
    private e[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte[] i;

    public aew() {
    }

    public aew(int n2, byte by2, boolean bl2, Collection collection, byte[] arrby, int n3, int n4, int n5, int n6) {
        this.a = n2;
        this.b = by2;
        this.c = bl2;
        this.d = collection.toArray(new e[collection.size()]);
        this.e = n3;
        this.f = n4;
        this.g = n5;
        this.h = n6;
        this.i = new byte[n5 * n6];
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                this.i[i2 + i3 * n5] = arrby[n3 + i2 + (n4 + i3) * 128];
            }
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.E();
        this.c = si2.D();
        this.d = new e[si2.e()];
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            short s2 = si2.E();
            this.d[i2] = new e((byte)(s2 >> 4 & 0xF), si2.E(), si2.E(), (byte)(s2 & 0xF));
        }
        this.g = si2.F();
        if (this.g > 0) {
            this.h = si2.F();
            this.e = si2.F();
            this.f = si2.F();
            this.i = si2.a();
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.B(this.b);
        si2.a(this.c);
        si2.d(this.d.length);
        for (e e2 : this.d) {
            si2.B((e2.a() & 0xF) << 4 | e2.d() & 0xF);
            si2.B(e2.b());
            si2.B(e2.c());
        }
        si2.B(this.g);
        if (this.g > 0) {
            si2.B(this.h);
            si2.B(this.e);
            si2.B(this.f);
            si2.a(this.i);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public void a(aph aph2) {
        int n2;
        aph2.f = this.b;
        aph2.e = this.c;
        aph2.i.clear();
        for (n2 = 0; n2 < this.d.length; ++n2) {
            e e2 = this.d[n2];
            aph2.i.put("icon-" + n2, e2);
        }
        for (n2 = 0; n2 < this.g; ++n2) {
            for (int i2 = 0; i2 < this.h; ++i2) {
                aph2.g[this.e + n2 + (this.f + i2) * 128] = this.i[n2 + i2 * this.g];
            }
        }
    }
}

