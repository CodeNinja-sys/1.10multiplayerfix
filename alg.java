/*
 * Decompiled with CFR 0.150.
 */
public class alg
implements fc {
    private final avq a;
    private final bdl b;
    private beo c;
    private final cbg d;

    public alg(bdl bdl2, cbg cbg2) {
        this.b = bdl2;
        this.d = cbg2;
        this.a = new avq(bdl2, this);
    }

    @Override
    public bdl b() {
        return this.b;
    }

    @Override
    public void a(bdl bdl2) {
    }

    @Override
    public beo b(bdl bdl2) {
        return this.c;
    }

    @Override
    public void a(beo beo2) {
        this.c = beo2;
    }

    @Override
    public void a(jc jc2) {
        jc2.g();
    }

    @Override
    public void a(bhl bhl2) {
    }

    @Override
    public cbg v() {
        if (this.d != null) {
            return this.d;
        }
        return new du("entity.Villager.name", new Object[0]);
    }
}

