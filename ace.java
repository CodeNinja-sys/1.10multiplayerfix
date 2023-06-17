/*
 * Decompiled with CFR 0.150.
 */
public class ace
extends bsg {
    private final cpk u;

    public ace(String string, cpk cpk2, cpk cpk3) {
        super(string, cpk2);
        this.u = cpk3;
    }

    @Override
    public cpk a() {
        return this.t;
    }

    @Override
    public cpk b() {
        return this.u;
    }

    @Override
    public cbg a(bga bga2) {
        cbg cbg2 = this.u == null ? this.t.v() : this.u.v();
        bhl bhl2 = this.u instanceof bga ? ((bga)this.u).bt() : null;
        String string = "death.attack." + this.s;
        String string2 = string + ".item";
        if (bhl2 != null && bhl2.s() && caf.c(string2)) {
            return new du(string2, bga2.v(), cbg2, bhl2.B());
        }
        return new du(string, bga2.v(), cbg2);
    }
}

