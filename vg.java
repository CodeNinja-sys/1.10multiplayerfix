/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class vg
extends awm {
    private static final d a = org.apache.logging.log4j.c.c();
    private final bbb b;
    private final List w = ov.a();
    private int x = -1;

    public vg(bbb bbb2, bxy bxy2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy2, n2, n3, n4, n5, n6);
        this.b = bbb2;
        this.l();
    }

    public void l() {
        List list;
        bxj bxj2 = this.c.i();
        try {
            list = bxj2.b();
        }
        catch (vd vd2) {
            a.b("Couldn't load level list", (Throwable)vd2);
            this.c.a(new tc("Unable to load worlds", vd2.getMessage()));
            return;
        }
        Collections.sort(list);
        for (bwp bwp2 : list) {
            this.w.add(new coq(this, bwp2, this.c.i()));
        }
    }

    public coq b(int n2) {
        return (coq)this.w.get(n2);
    }

    @Override
    protected int a() {
        return this.w.size();
    }

    @Override
    protected int c() {
        return super.c() + 20;
    }

    @Override
    public int d() {
        return super.d() + 50;
    }

    public void g(int n2) {
        this.x = n2;
        this.b.a(this.m());
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.x;
    }

    public coq m() {
        return this.x < 0 || this.x >= this.a() ? null : this.b(this.x);
    }

    public bbb n() {
        return this.b;
    }

    @Override
    public /* synthetic */ ye c(int n2) {
        return this.b(n2);
    }
}

