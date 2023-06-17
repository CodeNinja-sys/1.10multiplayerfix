/*
 * Decompiled with CFR 0.150.
 */
public class ahw
extends chu {
    public ahw() {
        this(0.0f);
    }

    public ahw(float f2) {
        this(f2, 64, 32);
    }

    protected ahw(float f2, int n2, int n3) {
        super(f2, 0.0f, n2, n3);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, cpk cpk2) {
        if (!(cpk2 instanceof bdi)) {
            return;
        }
        bdi bdi2 = (bdi)cpk2;
        this.e.f = (float)Math.PI / 180 * bdi2.ad().b();
        this.e.g = (float)Math.PI / 180 * bdi2.ad().c();
        this.e.h = (float)Math.PI / 180 * bdi2.ad().d();
        this.e.a(0.0f, 1.0f, 0.0f);
        this.g.f = (float)Math.PI / 180 * bdi2.ae().b();
        this.g.g = (float)Math.PI / 180 * bdi2.ae().c();
        this.g.h = (float)Math.PI / 180 * bdi2.ae().d();
        this.i.f = (float)Math.PI / 180 * bdi2.af().b();
        this.i.g = (float)Math.PI / 180 * bdi2.af().c();
        this.i.h = (float)Math.PI / 180 * bdi2.af().d();
        this.h.f = (float)Math.PI / 180 * bdi2.ah().b();
        this.h.g = (float)Math.PI / 180 * bdi2.ah().c();
        this.h.h = (float)Math.PI / 180 * bdi2.ah().d();
        this.k.f = (float)Math.PI / 180 * bdi2.al().b();
        this.k.g = (float)Math.PI / 180 * bdi2.al().c();
        this.k.h = (float)Math.PI / 180 * bdi2.al().d();
        this.k.a(1.9f, 11.0f, 0.0f);
        this.j.f = (float)Math.PI / 180 * bdi2.am().b();
        this.j.g = (float)Math.PI / 180 * bdi2.am().c();
        this.j.h = (float)Math.PI / 180 * bdi2.am().d();
        this.j.a(-1.9f, 11.0f, 0.0f);
        ahw.a(this.e, this.f);
    }
}

