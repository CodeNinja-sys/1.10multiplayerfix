/*
 * Decompiled with CFR 0.150.
 */
public class aiu
implements ye {
    private final bxy a = bxy.B();
    private final cwv b;
    private final cwv c;

    public aiu(cwv cwv2, cwv cwv3) {
        this.b = cwv2;
        this.c = cwv3;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        if (this.b != null) {
            this.b.h = n4;
            this.b.c(this.a, n7, n8);
        }
        if (this.c != null) {
            this.c.h = n4;
            this.c.c(this.a, n7, n8);
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b.b(this.a, n3, n4)) {
            if (this.b instanceof bcy) {
                this.a.u.a(((bcy)this.b).a(), 1);
                this.b.i = this.a.u.c(oi.a(this.b.j));
            }
            return true;
        }
        if (this.c != null && this.c.b(this.a, n3, n4)) {
            if (this.c instanceof bcy) {
                this.a.u.a(((bcy)this.c).a(), 1);
                this.c.i = this.a.u.c(oi.a(this.c.j));
            }
            return true;
        }
        return false;
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (this.b != null) {
            this.b.a(n3, n4);
        }
        if (this.c != null) {
            this.c.a(n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }
}

