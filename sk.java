/*
 * Decompiled with CFR 0.150.
 */
public class sk
implements ds {
    private float a;
    private int b;
    private float c;

    public sk() {
    }

    public sk(float f2, int n2, float f3) {
        this.a = f2;
        this.b = n2;
        this.c = f3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.O();
        this.b = si2.e();
        this.c = si2.O();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.d(this.b);
        si2.a(this.c);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public float a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }
}

