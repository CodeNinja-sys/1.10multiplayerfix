/*
 * Decompiled with CFR 0.150.
 */
public class cas {
    public amj a;
    public float b;
    public float c;

    public cas(float f2, float f3, float f4, float f5, float f6) {
        this(new amj(f2, f3, f4), f5, f6);
    }

    public cas a(float f2, float f3) {
        return new cas(this, f2, f3);
    }

    public cas(cas cas2, float f2, float f3) {
        this.a = cas2.a;
        this.b = f2;
        this.c = f3;
    }

    public cas(amj amj2, float f2, float f3) {
        this.a = amj2;
        this.b = f2;
        this.c = f3;
    }
}

