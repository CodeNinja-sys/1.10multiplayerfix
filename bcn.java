/*
 * Decompiled with CFR 0.150.
 */
public class bcn {
    private final alj a;
    private float b;
    private cpk c;
    private bdl d;
    private ahy e;

    public bcn(alj alj2) {
        this.a = alj2;
    }

    public bcn a(float f2) {
        this.b = f2;
        return this;
    }

    public bcn a(cpk cpk2) {
        this.c = cpk2;
        return this;
    }

    public bcn a(bdl bdl2) {
        this.d = bdl2;
        return this;
    }

    public bcn a(ahy ahy2) {
        this.e = ahy2;
        return this;
    }

    public abe a() {
        return new abe(this.b, this.a, this.a.V(), this.c, this.d, this.e);
    }
}

