/*
 * Decompiled with CFR 0.150.
 */
public class deo
extends wa {
    private static final bpx a = new bpx("textures/entity/spider/cave_spider.png");

    public deo(bid bid2) {
        super(bid2);
        this.h *= 0.7f;
    }

    protected void a(bys bys2, float f2) {
        cja.b(0.7f, 0.7f, 0.7f);
    }

    protected bpx a(bys bys2) {
        return a;
    }

    @Override
    protected /* synthetic */ bpx b(yi yi2) {
        return this.a((bys)yi2);
    }
}

