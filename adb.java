/*
 * Decompiled with CFR 0.150.
 */
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class adb
extends deg {
    private static final d b = org.apache.logging.log4j.c.c();
    private amj c;
    private int d;

    public adb(brd brd2) {
        super(brd2);
    }

    @Override
    public void a() {
        if (this.c == null) {
            b.f("Aborting charge player as no target was set.");
            this.a.aL().a(baw.a);
            return;
        }
        if (this.d > 0 && this.d++ >= 10) {
            this.a.aL().a(baw.a);
            return;
        }
        double d2 = this.c.c(this.a.aU, this.a.aV, this.a.aW);
        if (d2 < 100.0 || d2 > 22500.0 || this.a.bf || this.a.bg) {
            ++this.d;
        }
    }

    @Override
    public void b() {
        this.c = null;
        this.d = 0;
    }

    public void a(amj amj2) {
        this.c = amj2;
    }

    @Override
    public float f() {
        return 3.0f;
    }

    @Override
    public amj c() {
        return this.c;
    }

    @Override
    public baw d() {
        return baw.i;
    }
}

