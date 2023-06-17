/*
 * Decompiled with CFR 0.150.
 */
package e.a;

public class w {
    public float a;
    public float b;
    public float c;

    public w() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public w(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public w a() {
        return new w(this.a, this.b, this.c);
    }

    public w a(w w2, w w3) {
        return new w(w2.b * w3.c - w3.b * w2.c, w2.c * w3.a - w3.c * w2.a, w2.a * w3.b - w3.a * w2.b);
    }

    public w a(w w2) {
        return new w(this.b * w2.c - w2.b * this.c, this.c * w2.a - w2.c * this.a, this.a * w2.b - w2.a * this.b);
    }

    public float b(w w2, w w3) {
        return w2.a * w3.a + w2.b * w3.b + w2.c * w3.c;
    }

    public float b(w w2) {
        return this.a * w2.a + this.b * w2.b + this.c * w2.c;
    }

    public w c(w w2, w w3) {
        return new w(w2.a + w3.a, w2.b + w3.b, w2.c + w3.c);
    }

    public w c(w w2) {
        return new w(this.a + w2.a, this.b + w2.b, this.c + w2.c);
    }

    public w d(w w2, w w3) {
        return new w(w2.a - w3.a, w2.b - w3.b, w2.c - w3.c);
    }

    public w d(w w2) {
        return new w(this.a - w2.a, this.b - w2.b, this.c - w2.c);
    }

    public float b() {
        return (float)Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
    }

    public void c() {
        double d2 = Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
        this.a = (float)((double)this.a / d2);
        this.b = (float)((double)this.b / d2);
        this.c = (float)((double)this.c / d2);
    }

    public String toString() {
        return "Vector3D (" + this.a + ", " + this.b + ", " + this.c + ")";
    }

    public /* synthetic */ Object clone() {
        return this.a();
    }
}

