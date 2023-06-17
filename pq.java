/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.l.m;

class pq
implements cm {
    final /* synthetic */ cee a;

    pq(cee cee2) {
        this.a = cee2;
    }

    public boolean a(String string) {
        Float f2 = m.a(string);
        return string.isEmpty() || f2 != null && m.b(f2.floatValue()) && f2.floatValue() >= 0.0f;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((String)object);
    }
}

