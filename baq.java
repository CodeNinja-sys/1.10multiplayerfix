/*
 * Decompiled with CFR 0.150.
 */
public class baq
implements ds {
    private float a;
    private int b;
    private int c;

    public baq() {
    }

    public baq(float f2, int n2, int n3) {
        this.a = f2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.O();
        this.c = si2.e();
        this.b = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.d(this.c);
        si2.d(this.b);
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

    public int c() {
        return this.c;
    }
}

