/*
 * Decompiled with CFR 0.150.
 */
public class cej
implements ds {
    private int[] a;

    public cej() {
    }

    public cej(int ... arrn) {
        this.a = arrn;
    }

    @Override
    public void a(si si2) {
        this.a = new int[si2.e()];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = si2.e();
        }
    }

    @Override
    public void b(si si2) {
        si2.d(this.a.length);
        for (int n2 : this.a) {
            si2.d(n2);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int[] a() {
        return this.a;
    }
}

