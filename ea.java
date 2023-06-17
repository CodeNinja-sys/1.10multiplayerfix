/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ea
implements v {
    public clu a(w w2, Type type, u u2) {
        return new clu(this.a(u2, w2.u()));
    }

    private List a(u u2, t t2) {
        ArrayList arrayList = ov.a();
        for (w w2 : t2) {
            arrayList.add((bey)u2.a(w2, (Type)((Object)bey.class)));
        }
        return arrayList;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

