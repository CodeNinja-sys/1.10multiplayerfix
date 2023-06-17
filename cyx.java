/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Collections;
import java.util.List;

public class cyx
extends cni {
    protected final Class b;
    private final int a;
    protected final bay g;
    protected final cm h;
    protected bga i;

    public cyx(cfl cfl2, Class class_, boolean bl2) {
        this(cfl2, class_, bl2, false);
    }

    public cyx(cfl cfl2, Class class_, boolean bl2, boolean bl3) {
        this(cfl2, class_, 10, bl2, bl3, null);
    }

    public cyx(cfl cfl2, Class class_, int n2, boolean bl2, boolean bl3, cm cm2) {
        super(cfl2, bl2, bl3);
        this.b = class_;
        this.a = n2;
        this.g = new bay(cfl2);
        this.a(1);
        this.h = new yx(this, cm2);
    }

    @Override
    public boolean b() {
        if (this.a > 0 && this.c.aW().nextInt(this.a) != 0) {
            return false;
        }
        if (this.b == bdl.class || this.b == czt.class) {
            this.i = this.c.aQ.a(this.c.aU, this.c.aV + (double)this.c.A(), this.c.aW, this.aK_(), this.aK_(), new alq(this), this.h);
            return this.i != null;
        }
        List list = this.c.aQ.a(this.b, this.a(this.aK_()), this.h);
        if (list.isEmpty()) {
            return false;
        }
        Collections.sort(list, this.g);
        this.i = (bga)list.get(0);
        return true;
    }

    protected cxt a(double d2) {
        return this.c.cD().b(d2, 4.0, d2);
    }

    @Override
    public void c() {
        this.c.b(this.i);
        super.c();
    }
}

