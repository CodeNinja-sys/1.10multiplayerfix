/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;
import java.util.Map;

final class am
implements bl {
    am() {
    }

    public String a(Map.Entry entry) {
        if (entry == null) {
            return "<NULL>";
        }
        bvs bvs2 = (bvs)entry.getKey();
        return bvs2.b() + "=" + this.a(bvs2, (Comparable)entry.getValue());
    }

    private String a(bvs bvs2, Comparable comparable) {
        return bvs2.a(comparable);
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((Map.Entry)object);
    }
}

