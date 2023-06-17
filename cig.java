/*
 * Decompiled with CFR 0.150.
 */
public class cig {
    protected final float a;
    protected final float b;
    protected final float c;

    public cig(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public cig(bmh bmh2) {
        this.a = bmh2.f(0);
        this.b = bmh2.f(1);
        this.c = bmh2.f(2);
    }

    public bmh a() {
        bmh bmh2 = new bmh();
        bmh2.a(new po(this.a));
        bmh2.a(new po(this.b));
        bmh2.a(new po(this.c));
        return bmh2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof cig)) {
            return false;
        }
        cig cig2 = (cig)object;
        return this.a == cig2.a && this.b == cig2.b && this.c == cig2.c;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }
}

