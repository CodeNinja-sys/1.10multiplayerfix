/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class pg
implements ds {
    private int a;
    private int[] b;

    public pg() {
    }

    public pg(cpk cpk2) {
        this.a = cpk2.bW();
        List list = cpk2.cH();
        this.b = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b[i2] = ((cpk)list.get(i2)).bW();
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.b();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int[] a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}

