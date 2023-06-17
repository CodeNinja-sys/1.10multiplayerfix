/*
 * Decompiled with CFR 0.150.
 */
public class awa
extends ck {
    private final nb a;
    private boolean b;

    public awa(nb nb2) {
        this.a = nb2;
        this.a(5);
    }

    @Override
    public boolean b() {
        if (!this.a.B()) {
            return false;
        }
        if (this.a.V_()) {
            return false;
        }
        if (!this.a.be) {
            return false;
        }
        bga bga2 = this.a.E();
        if (bga2 == null) {
            return true;
        }
        if (this.a.l(bga2) < 144.0 && bga2.aX() != null) {
            return false;
        }
        return this.b;
    }

    @Override
    public void c() {
        this.a.ap().n();
        this.a.c(true);
    }

    @Override
    public void d() {
        this.a.c(false);
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }
}

