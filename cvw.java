/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cvw
implements ds {
    private int a;
    private bhl[] b;

    public cvw() {
    }

    public cvw(int n2, List list) {
        this.a = n2;
        this.b = new bhl[list.size()];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            bhl bhl2 = (bhl)list.get(i2);
            this.b[i2] = bhl2 == null ? null : bhl2.j();
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.F();
        int n2 = si2.G();
        this.b = new bhl[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b[i2] = si2.i();
        }
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b.length);
        for (bhl bhl2 : this.b) {
            si2.a(bhl2);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public bhl[] b() {
        return this.b;
    }
}

