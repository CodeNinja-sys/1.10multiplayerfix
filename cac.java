/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.Map;

final class cac
implements cm {
    final /* synthetic */ ala a;
    final /* synthetic */ Map b;

    cac(ala ala2, Map map) {
        this.a = ala2;
        this.b = map;
    }

    public boolean a(cpk cpk2) {
        if (cpk2 == null) {
            return false;
        }
        bzt bzt2 = ((iu)((Object)this.a.o_().a(0))).P();
        for (Map.Entry entry : this.b.entrySet()) {
            String string;
            bhi bhi2;
            String string2 = (String)entry.getKey();
            boolean bl2 = false;
            if (string2.endsWith("_min") && string2.length() > 4) {
                bl2 = true;
                string2 = string2.substring(0, string2.length() - 4);
            }
            if ((bhi2 = bzt2.b(string2)) == null) {
                return false;
            }
            String string3 = string = cpk2 instanceof czt ? cpk2.i_() : cpk2.cy();
            if (!bzt2.b(string, bhi2)) {
                return false;
            }
            czu czu2 = bzt2.c(string, bhi2);
            int n2 = czu2.b();
            if (n2 < (Integer)entry.getValue() && bl2) {
                return false;
            }
            if (n2 <= (Integer)entry.getValue() || bl2) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cpk)object);
    }
}

