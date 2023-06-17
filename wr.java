/*
 * Decompiled with CFR 0.150.
 */
public class wr
extends bsq {
    private final bvp a;

    public wr() {
        super(1);
        this.a = new bvp();
        this.a.a("id", "Pig");
    }

    public wr(bvp bvp2) {
        this(bvp2.b("Weight", 99) ? bvp2.h("Weight") : 1, bvp2.o("Entity"));
    }

    public wr(int n2, bvp bvp2) {
        super(n2);
        this.a = bvp2;
    }

    public bvp a() {
        bvp bvp2 = new bvp();
        bvp2.a("Entity", this.a);
        bvp2.a("Weight", this.c);
        return bvp2;
    }

    public bvp b() {
        return this.a;
    }
}

