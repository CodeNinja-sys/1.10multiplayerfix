/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;

public class bey {
    private final baa a;
    private final agm b;

    public bey(baa baa2, agm agm2) {
        if (baa2 == null) {
            throw new IllegalArgumentException("Missing condition for selector");
        }
        if (agm2 == null) {
            throw new IllegalArgumentException("Missing variant for selector");
        }
        this.a = baa2;
        this.b = agm2;
    }

    public agm a() {
        return this.b;
    }

    public cm a(bkp bkp2) {
        return this.a.a(bkp2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bey) {
            bey bey2 = (bey)object;
            if (this.a.equals(bey2.a)) {
                return this.b.equals(bey2.b);
            }
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

