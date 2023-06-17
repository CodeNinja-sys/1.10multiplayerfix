/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import com.a.a.d.aad;
import com.a.a.d.lo;
import java.util.Collection;
import java.util.HashSet;

public class qf
extends cgi {
    private final lo a;

    protected qf(String string, int n2, int n3) {
        super(string, Integer.class);
        if (n2 < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n3 <= n2) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n2 + ")");
        }
        HashSet hashSet = aad.a();
        for (int i2 = n2; i2 <= n3; ++i2) {
            hashSet.add(i2);
        }
        this.a = lo.a(hashSet);
    }

    @Override
    public Collection a() {
        return this.a;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof qf && super.equals(object)) {
            qf qf2 = (qf)object;
            return this.a.equals(qf2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.a.hashCode();
    }

    public static qf a(String string, int n2, int n3) {
        return new qf(string, n2, n3);
    }

    @Override
    public cg a(String string) {
        try {
            Integer n2 = Integer.valueOf(string);
            return this.a.contains(n2) ? cg.b(n2) : cg.f();
        }
        catch (NumberFormatException numberFormatException) {
            return cg.f();
        }
    }

    public String a(Integer n2) {
        return n2.toString();
    }
}

