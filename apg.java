/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.bw;
import com.a.a.d.hy;
import java.util.Iterator;
import java.util.Map;

public class apg
extends dai
implements awg {
    protected final aww a = new aww(256);
    protected final Map b = ((bw)this.c).aT_();

    public void a(int n2, Object object, Object object2) {
        this.a.a(object2, n2);
        this.a(object, object2);
    }

    @Override
    protected Map b() {
        return hy.a();
    }

    @Override
    public Object c(Object object) {
        return super.c(object);
    }

    public Object b(Object object) {
        return this.b.get(object);
    }

    @Override
    public boolean d(Object object) {
        return super.d(object);
    }

    public int a(Object object) {
        return this.a.a(object);
    }

    public Object a(int n2) {
        return this.a.a(n2);
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }
}

