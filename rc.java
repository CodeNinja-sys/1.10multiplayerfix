/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class rc
implements v {
    public agm a(w w2, Type type, u u2) {
        ArrayList arrayList = ov.a();
        if (w2.p()) {
            t t2 = w2.u();
            if (t2.b() == 0) {
                throw new aa("Empty variant array");
            }
            for (w w3 : t2) {
                arrayList.add((cbn)u2.a(w3, (Type)((Object)cbn.class)));
            }
        } else {
            arrayList.add((cbn)u2.a(w2, (Type)((Object)cbn.class)));
        }
        return new agm(arrayList);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

