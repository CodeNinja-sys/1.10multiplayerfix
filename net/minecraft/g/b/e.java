/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.b;

import com.a.a.b.cg;
import com.a.a.b.cn;
import com.a.a.d.cm;
import com.a.a.d.lo;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Map;
import net.minecraft.g.b.d;
import net.minecraft.u.at;

public class e
extends d {
    private final lo a;
    private final Map b = sz.c();

    protected e(String string, Class class_, Collection collection) {
        super(string, class_);
        this.a = lo.a(collection);
        for (Enum enum_ : collection) {
            String string2 = ((at)((Object)enum_)).a();
            if (this.b.containsKey(string2)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + string2 + "'");
            }
            this.b.put(string2, enum_);
        }
    }

    @Override
    public Collection b() {
        return this.a;
    }

    @Override
    public cg a(String string) {
        return cg.c((Enum)this.b.get(string));
    }

    public String a(Enum enum_) {
        return ((at)((Object)enum_)).a();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof e && super.equals(object)) {
            e e2 = (e)object;
            return this.a.equals(e2.a) && this.b.equals(e2.b);
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

    public static e a(String string, Class class_) {
        return e.a(string, class_, cn.a());
    }

    public static e a(String string, Class class_, com.a.a.b.cm cm2) {
        return e.a(string, class_, cm.a((Collection)ov.a((Enum[])class_.getEnumConstants()), cm2));
    }

    public static e a(String string, Class class_, Enum ... arrenum) {
        return e.a(string, class_, ov.a(arrenum));
    }

    public static e a(String string, Class class_, Collection collection) {
        return new e(string, class_, collection);
    }
}

