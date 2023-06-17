/*
 * Decompiled with CFR 0.150.
 */
class abc
extends dgj {
    final /* synthetic */ bhl a;
    final /* synthetic */ csp b;

    abc(csp csp2, bhl bhl2) {
        this.b = csp2;
        this.a = bhl2;
    }

    @Override
    protected cvj a(iu iu2, bts bts2, bhl bhl2) {
        return new tp(iu2, bts2.b(), bts2.c(), bts2.d(), this.a.j());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }
}

