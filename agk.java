/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.util.Map;

class agk
extends an {
    final /* synthetic */ Map a;
    final /* synthetic */ ddq b;

    agk(ddq ddq2, Map map) {
        this.b = ddq2;
        this.a = map;
    }

    @Override
    public void a(e e2, Object object) {
        if (object == null) {
            e2.f();
        } else {
            e2.b(ddq.a(this.b, object));
        }
    }

    @Override
    public Object a(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return this.a.get(a2.h());
    }
}

