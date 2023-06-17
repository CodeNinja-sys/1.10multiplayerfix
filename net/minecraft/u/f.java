/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.nj;
import java.util.Iterator;
import java.util.List;
import net.minecraft.u.e;

class f
implements Iterable {
    final /* synthetic */ e a;
    private final /* synthetic */ Class b;

    f(e e2, Class class_) {
        this.a = e2;
        this.b = class_;
    }

    public Iterator iterator() {
        List list = (List)e.a(this.a).get(this.a.b(this.b));
        if (list == null) {
            return nj.a();
        }
        Iterator iterator = list.iterator();
        return nj.b(iterator, this.b);
    }
}

