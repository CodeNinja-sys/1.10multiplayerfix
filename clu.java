/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class clu {
    private final List a;
    private bkp b;

    public clu(List list) {
        this.a = list;
    }

    public List a() {
        return this.a;
    }

    public Set b() {
        HashSet hashSet = aad.a();
        for (bey bey2 : this.a) {
            hashSet.add(bey2.a());
        }
        return hashSet;
    }

    public void a(bkp bkp2) {
        this.b = bkp2;
    }

    public bkp c() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof clu) {
            clu clu2 = (clu)object;
            if (this.a.equals(clu2.a)) {
                if (this.b == null) {
                    return clu2.b == null;
                }
                return this.b.equals(clu2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + (this.b == null ? 0 : this.b.hashCode());
    }
}

