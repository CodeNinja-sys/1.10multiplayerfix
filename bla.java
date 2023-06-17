/*
 * Decompiled with CFR 0.150.
 */
public class bla
implements ds {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected byte e;
    protected byte f;
    protected boolean g;
    protected boolean h;

    public bla() {
    }

    public bla(int n2) {
        this.a = n2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public cpk a(iu iu2) {
        return iu2.a(this.a);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public byte d() {
        return this.e;
    }

    public byte e() {
        return this.f;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.g;
    }
}

