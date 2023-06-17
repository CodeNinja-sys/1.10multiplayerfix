/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;

public abstract class sy
implements abr {
    protected Map a = sz.d();

    public String a(Map map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(",");
            }
            bvs bvs2 = (bvs)entry.getKey();
            stringBuilder.append(bvs2.b());
            stringBuilder.append("=");
            stringBuilder.append(this.a(bvs2, (Comparable)entry.getValue()));
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append("normal");
        }
        return stringBuilder.toString();
    }

    private String a(bvs bvs2, Comparable comparable) {
        return bvs2.a(comparable);
    }

    @Override
    public Map a(bfa bfa2) {
        for (dbk dbk2 : bfa2.r().a()) {
            this.a.put(dbk2, this.a(dbk2));
        }
        return this.a;
    }

    protected abstract up a(dbk var1);
}

