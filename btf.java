/*
 * Decompiled with CFR 0.150.
 */
public class btf
extends cni {
    nb a;
    bga b;
    private int g;

    public btf(nb nb2) {
        super(nb2, false);
        this.a = nb2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (!this.a.B()) {
            return false;
        }
        bga bga2 = this.a.E();
        if (bga2 == null) {
            return false;
        }
        this.b = bga2.aZ();
        int n2 = bga2.ba();
        return n2 != this.g && this.a(this.b, false) && this.a.a(this.b, bga2);
    }

    @Override
    public void c() {
        this.c.b(this.b);
        bga bga2 = this.a.E();
        if (bga2 != null) {
            this.g = bga2.ba();
        }
        super.c();
    }
}

