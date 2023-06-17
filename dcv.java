/*
 * Decompiled with CFR 0.150.
 */
public class dcv
extends cni {
    hx a;
    bga b;

    public dcv(hx hx2) {
        super(hx2, false, true);
        this.a = hx2;
        this.a(1);
    }

    @Override
    public boolean b() {
        aus aus2 = this.a.x();
        if (aus2 == null) {
            return false;
        }
        this.b = aus2.b(this.a);
        if (this.b instanceof ddh) {
            return false;
        }
        if (this.a(this.b, false)) {
            return true;
        }
        if (this.c.aW().nextInt(20) == 0) {
            this.b = aus2.c(this.a);
            return this.a(this.b, false);
        }
        return false;
    }

    @Override
    public void c() {
        this.a.b(this.b);
        super.c();
    }
}

