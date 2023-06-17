/*
 * Decompiled with CFR 0.150.
 */
public class bsg
extends ahy {
    protected cpk t;
    private boolean u;

    public bsg(String string, cpk cpk2) {
        super(string);
        this.t = cpk2;
    }

    public bsg w() {
        this.u = true;
        return this;
    }

    public boolean x() {
        return this.u;
    }

    @Override
    public cpk b() {
        return this.t;
    }

    @Override
    public cbg a(bga bga2) {
        bhl bhl2 = this.t instanceof bga ? ((bga)this.t).bt() : null;
        String string = "death.attack." + this.s;
        String string2 = string + ".item";
        if (bhl2 != null && bhl2.s() && caf.c(string2)) {
            return new du(string2, bga2.v(), this.t.v(), bhl2.B());
        }
        return new du(string, bga2.v(), this.t.v());
    }

    @Override
    public boolean r() {
        return this.t != null && this.t instanceof bga && !(this.t instanceof bdl);
    }

    @Override
    public amj v() {
        return new amj(this.t.aU, this.t.aV, this.t.aW);
    }
}

