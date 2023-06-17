/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.lo;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Map;

public class byc
extends cgi {
    private final lo a;
    private final Map b = sz.c();

    protected byc(String string, Class class_, Collection collection) {
        super(string, class_);
        this.a = lo.a(collection);
        for (Enum enum_ : collection) {
            String string2 = ((hn)((Object)enum_)).a();
            if (this.b.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.b.put(string2, enum_);
        }
    }

    @Override
    public Collection a() {
        return this.a;
    }

    @Override
    public cg a(String string) {
        return cg.c(this.b.get(string));
    }

    public String a(Enum enum_) {
        return ((hn)((Object)enum_)).a();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof byc && super.equals(object)) {
            byc byc2 = (byc)object;
            return this.a.equals(byc2.a) && this.b.equals(byc2.b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.a.hashCode();
        n2 = 31 * n2 + this.b.hashCode();
        return n2;
    }

    public static byc a(String string, Class class_) {
        return byc.a(string, class_, cn.a());
    }

    public static byc a(String string, Class class_, com.a.a.b.cm cm2) {
        return byc.a(string, class_, cm.a((Collection)ov.a(class_.getEnumConstants()), cm2));
    }

    public static byc a(String string, Class class_, Enum ... arrenum) {
        return byc.a(string, class_, ov.a(arrenum));
    }

    public static byc a(String string, Class class_, Collection collection) {
        return new byc(string, class_, collection);
    }
}

