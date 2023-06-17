/*
 * Decompiled with CFR 0.150.
 */
public abstract class dgj
extends ckc {
    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        iu iu2 = bcl2.a();
        bts bts2 = crh.a(bcl2);
        bqk bqk2 = (bqk)((Object)bcl2.f().b(crh.a));
        cvj cvj2 = this.a(iu2, bts2, bhl2);
        cvj2.a(bqk2.h(), (float)bqk2.i() + 0.1f, bqk2.j(), this.b(), this.a());
        iu2.b((cpk)((Object)cvj2));
        bhl2.a(1);
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        bcl2.a().b(1002, bcl2.e(), 0);
    }

    protected abstract cvj a(iu var1, bts var2, bhl var3);

    protected float a() {
        return 6.0f;
    }

    protected float b() {
        return 1.1f;
    }
}

