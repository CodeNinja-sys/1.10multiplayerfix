/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class agm {
    private final List a;

    public agm(List list) {
        this.a = list;
    }

    public List a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof agm) {
            agm agm2 = (agm)object;
            return this.a.equals(agm2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

