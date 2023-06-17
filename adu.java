/*
 * Decompiled with CFR 0.150.
 */
public class adu
extends buc {
    protected final azg a;
    private final bth b;

    public adu(bid bid2, azg azg2, bth bth2) {
        super(bid2);
        this.a = azg2;
        this.b = bth2;
    }

    @Override
    public void a(cpk cpk2, double d2, double d3, double d4, float f2, float f3) {
        cja.D();
        cja.c((float)d2, (float)d3, (float)d4);
        cja.A();
        cja.b(-this.g.e, 0.0f, 1.0f, 0.0f);
        cja.b((float)(this.g.g.as == 2 ? -1 : 1) * this.g.f, 1.0f, 0.0f, 0.0f);
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        this.a(dam.g);
        if (this.j) {
            cja.g();
            cja.e(this.d(cpk2));
        }
        this.b.a(this.c(cpk2), cua.h);
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.B();
        cja.E();
        super.a(cpk2, d2, d3, d4, f2, f3);
    }

    public bhl c(cpk cpk2) {
        return new bhl(this.a);
    }

    @Override
    protected bpx a(cpk cpk2) {
        return dam.g;
    }
}

