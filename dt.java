/*
 * Decompiled with CFR 0.150.
 */
public class dt
extends ge {
    private final aai b;

    public dt(aai aai2) {
        super(aai2);
        this.b = aai2;
        this.e(0);
        this.a(true);
    }

    @Override
    public int a(int n2) {
        return n2 | 4;
    }

    @Override
    public String b(bhl bhl2) {
        return super.a() + "." + this.b.b(bhl2.h()).d();
    }
}

