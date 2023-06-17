/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.c.a;
import com.a.b.k;
import java.util.HashMap;
import java.util.Locale;
import net.minecraft.u.al;

public class ak
implements ap {
    @Override
    public an a(k k2, a a2) {
        Class class_ = a2.a();
        if (!class_.isEnum()) {
            return null;
        }
        HashMap hashMap = sz.c();
        for (Object t2 : class_.getEnumConstants()) {
            hashMap.put(this.a(t2), t2);
        }
        return new al(this, hashMap);
    }

    private String a(Object object) {
        return object instanceof Enum ? ((Enum)object).name().toLowerCase(Locale.US) : object.toString().toLowerCase(Locale.US);
    }

    static /* synthetic */ String a(ak ak2, Object object) {
        return ak2.a(object);
    }
}

