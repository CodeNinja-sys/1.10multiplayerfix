/*
 * Decompiled with CFR 0.150.
 */
public abstract class dbd
extends bql
implements bme,
ciq {
    private biu a = biu.a;

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a = biu.b(bvp2);
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (this.a != null) {
            this.a.a(bvp2);
        }
        return bvp2;
    }

    @Override
    public boolean aJ_() {
        return this.a != null && !this.a.a();
    }

    @Override
    public biu i() {
        return this.a;
    }

    @Override
    public void a(biu biu2) {
        this.a = biu2;
    }

    @Override
    public cbg v() {
        if (this.j_()) {
            return new aym(this.i_());
        }
        return new du(this.i_(), new Object[0]);
    }
}

