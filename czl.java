/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;

final class czl
implements v {
    czl() {
    }

    public cbg a(w w2, Type type, u u2) {
        if (w2.r()) {
            return new aym(w2.d());
        }
        if (w2.p()) {
            t t2 = w2.u();
            cbg cbg2 = null;
            for (w w3 : t2) {
                cbg cbg3 = this.a(w3, w3.getClass(), u2);
                if (cbg2 == null) {
                    cbg2 = cbg3;
                    continue;
                }
                cbg2.a(cbg3);
            }
            return cbg2;
        }
        throw new aa("Don't know how to turn " + w2 + " into a Component");
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

