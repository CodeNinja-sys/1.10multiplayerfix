/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import com.a.a.d.lo;
import java.util.Collection;

public class ddi
extends cgi {
    private final lo a = lo.b(true, (Object)false);

    protected ddi(String string) {
        super(string, Boolean.class);
    }

    @Override
    public Collection a() {
        return this.a;
    }

    public static ddi b(String string) {
        return new ddi(string);
    }

    @Override
    public cg a(String string) {
        if ("true".equals(string) || "false".equals(string)) {
            return cg.b(Boolean.valueOf(string));
        }
        return cg.f();
    }

    public String a(Boolean bl2) {
        return bl2.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof ddi && super.equals(object)) {
            ddi ddi2 = (ddi)object;
            return this.a.equals(ddi2.a);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.a.hashCode();
    }
}

