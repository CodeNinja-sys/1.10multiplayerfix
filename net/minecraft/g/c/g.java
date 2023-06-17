/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.d.mq;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.g.c.b;
import net.minecraft.g.c.j;
import net.minecraft.g.cn;

public abstract class g
implements b {
    private static final bx a = bx.a(',');
    private static final bl b = new j();

    @Override
    public b b(net.minecraft.g.b.b b2) {
        return this.a(b2, (Comparable)g.a(b2.b(), this.a(b2)));
    }

    protected static Object a(Collection collection, Object object) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().equals(object)) continue;
            if (iterator.hasNext()) {
                return iterator.next();
            }
            return collection.iterator().next();
        }
        return iterator.next();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(cn.v.b(this.c()));
        if (!this.b().isEmpty()) {
            stringBuilder.append("[");
            a.a(stringBuilder, mq.a((Iterable)this.b().e(), b));
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

