/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class ib
extends alj {
    private final alj a;

    public ib(a a2, ajq ajq2, int n2, alj alj2, cfe cfe2) {
        super(a2, ajq2, new aqv(alj2.E()), n2, cfe2);
        this.a = alj2;
        alj2.U().a(new od(this));
    }

    @Override
    protected void a() {
    }

    @Override
    public iu b() {
        this.x = this.a.J();
        this.B = this.a.P();
        this.z = this.a.V();
        String string = go.a(this.q);
        go go2 = (go)this.x.a(go.class, string);
        if (go2 == null) {
            this.y = new go(this);
            this.x.a(string, this.y);
        } else {
            this.y = go2;
            this.y.a(this);
        }
        return this;
    }

    public void c() {
        this.q.q();
    }
}

