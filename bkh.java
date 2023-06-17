/*
 * Decompiled with CFR 0.150.
 */
public class bkh
extends bql {
    public byte a;
    public boolean b;

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("note", this.a);
        bvp2.a("powered", this.b);
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = bvp2.f("note");
        this.a = (byte)cmk.a(this.a, 0, 24);
        this.b = bvp2.p("powered");
    }

    public void f() {
        this.a = (byte)((this.a + 1) % 25);
        this.c_();
    }

    public void a(iu iu2, cmz cmz2) {
        if (iu2.n(cmz2.g()).a() != ahk.a) {
            return;
        }
        ahk ahk2 = iu2.n(cmz2.h()).a();
        int n2 = 0;
        if (ahk2 == ahk.e) {
            n2 = 1;
        }
        if (ahk2 == ahk.p) {
            n2 = 2;
        }
        if (ahk2 == ahk.s) {
            n2 = 3;
        }
        if (ahk2 == ahk.d) {
            n2 = 4;
        }
        iu2.c(cmz2, blg.B, n2, this.a);
    }
}

