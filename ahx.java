/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ahx
extends cni {
    private final boolean a;
    private int b;
    private final Class[] g;

    public ahx(cfl cfl2, boolean bl2, Class ... arrclass) {
        super(cfl2, true);
        this.a = bl2;
        this.g = arrclass;
        this.a(1);
    }

    @Override
    public boolean b() {
        int n2 = this.c.aY();
        bga bga2 = this.c.aX();
        return n2 != this.b && bga2 != null && this.a(bga2, false);
    }

    @Override
    public void c() {
        this.c.b(this.c.aX());
        this.e = this.c.ar();
        this.b = this.c.aY();
        this.f = 300;
        if (this.a) {
            this.f();
        }
        super.c();
    }

    protected void f() {
        double d2 = this.aK_();
        List list = this.c.aQ.a(this.c.getClass(), new cxt(this.c.aU, this.c.aV, this.c.aW, this.c.aU + 1.0, this.c.aV + 1.0, this.c.aW + 1.0).b(d2, 10.0, d2));
        for (cfl cfl2 : list) {
            if (this.c == cfl2 || cfl2.ar() != null || this.c instanceof nb && ((nb)this.c).E() != ((nb)cfl2).E() || cfl2.d((cpk)this.c.aX())) continue;
            boolean bl2 = false;
            for (Class class_ : this.g) {
                if (cfl2.getClass() != class_) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            this.a(cfl2, this.c.aX());
        }
    }

    protected void a(cfl cfl2, bga bga2) {
        cfl2.b(bga2);
    }
}

