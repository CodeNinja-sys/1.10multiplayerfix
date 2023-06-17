/*
 * Decompiled with CFR 0.150.
 */
class cvz
extends ck {
    private final akr a;
    private float b;
    private int c;

    public cvz(akr akr2) {
        this.a = akr2;
        this.a(2);
    }

    @Override
    public boolean b() {
        return this.a.ar() == null && (this.a.be || this.a.V_() || this.a.cj() || this.a.b(ake.y));
    }

    @Override
    public void e() {
        if (--this.c <= 0) {
            this.c = 40 + this.a.aW().nextInt(60);
            this.b = this.a.aW().nextInt(360);
        }
        ((all)this.a.an()).a(this.b, false);
    }
}

