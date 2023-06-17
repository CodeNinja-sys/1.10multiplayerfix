/*
 * Decompiled with CFR 0.150.
 */
public class auu {
    private cmz e;
    public bmw a;
    public bqk b;
    public amj c;
    public cpk d;

    public auu(amj amj2, bqk bqk2, cmz cmz2) {
        this(bmw.b, amj2, bqk2, cmz2);
    }

    public auu(amj amj2, bqk bqk2) {
        this(bmw.b, amj2, bqk2, cmz.e);
    }

    public auu(cpk cpk2) {
        this(cpk2, new amj(cpk2.aU, cpk2.aV, cpk2.aW));
    }

    public auu(bmw bmw2, amj amj2, bqk bqk2, cmz cmz2) {
        this.a = bmw2;
        this.e = cmz2;
        this.b = bqk2;
        this.c = new amj(amj2.b, amj2.c, amj2.d);
    }

    public auu(cpk cpk2, amj amj2) {
        this.a = bmw.c;
        this.d = cpk2;
        this.c = amj2;
    }

    public cmz a() {
        return this.e;
    }

    public String toString() {
        return "HitResult{type=" + (Object)((Object)this.a) + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
    }
}

