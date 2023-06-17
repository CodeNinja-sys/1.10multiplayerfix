/*
 * Decompiled with CFR 0.150.
 */
public class baf
extends ck {
    private final xy a;

    public baf(xy xy2) {
        this.a = xy2;
        this.a(4);
        ((vp)xy2.ap()).c(true);
    }

    @Override
    public boolean b() {
        return this.a.V_() || this.a.cj();
    }

    @Override
    public void e() {
        if (this.a.aW().nextFloat() < 0.8f) {
            this.a.ao().a();
        }
    }
}

