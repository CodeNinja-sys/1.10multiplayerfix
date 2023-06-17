/*
 * Decompiled with CFR 0.150.
 */
public class bbk
implements ds {
    private int a;
    private byte b;
    private byte c;
    private int d;
    private byte e;

    public bbk() {
    }

    public bbk(int n2, cko cko2) {
        this.a = n2;
        this.b = (byte)(bfv.a(cko2.a()) & 0xFF);
        this.c = (byte)(cko2.c() & 0xFF);
        this.d = cko2.b() > 32767 ? 32767 : cko2.b();
        this.e = 0;
        if (cko2.d()) {
            this.e = (byte)(this.e | 1);
        }
        if (cko2.e()) {
            this.e = (byte)(this.e | 2);
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.E();
        this.c = si2.E();
        this.d = si2.e();
        this.e = si2.E();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.B(this.b);
        si2.B(this.c);
        si2.d(this.d);
        si2.B(this.e);
    }

    public boolean a() {
        return this.d == 32767;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return (this.e & 2) == 2;
    }

    public boolean g() {
        return (this.e & 1) == 1;
    }
}

