/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bin
extends aeu {
    private final boolean b;

    public bin(boolean bl2) {
        super(0, 0.0f, false);
        this.b = bl2;
    }

    @Override
    public int g(bhl bhl2) {
        aty aty2 = aty.a(bhl2);
        if (this.b && aty2.g()) {
            return aty2.e();
        }
        return aty2.c();
    }

    @Override
    public float h(bhl bhl2) {
        aty aty2 = aty.a(bhl2);
        if (this.b && aty2.g()) {
            return aty2.f();
        }
        return aty2.d();
    }

    @Override
    protected void a(bhl bhl2, iu iu2, bdl bdl2) {
        aty aty2 = aty.a(bhl2);
        if (aty2 == aty.d) {
            bdl2.b(new cko(ake.s, 1200, 3));
            bdl2.b(new cko(ake.q, 300, 2));
            bdl2.b(new cko(ake.i, 300, 1));
        }
        super.a(bhl2, iu2, bdl2);
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (aty aty2 : aty.values()) {
            if (this.b && !aty2.g()) continue;
            list.add(new bhl(this, 1, aty2.a()));
        }
    }

    @Override
    public String b(bhl bhl2) {
        aty aty2 = aty.a(bhl2);
        return this.a() + "." + aty2.b() + "." + (this.b && aty2.g() ? "cooked" : "raw");
    }
}

