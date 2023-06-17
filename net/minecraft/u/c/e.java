/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.c;

import com.a.a.d.sz;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import net.minecraft.u.c.a;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class e
implements a {
    private static final d a = org.apache.logging.log4j.c.c();
    protected final Map c = this.a();
    private Object[] b;

    protected Map a() {
        return sz.c();
    }

    @Override
    public Object a(Object object) {
        return this.c.get(object);
    }

    @Override
    public void a(Object object, Object object2) {
        ao.a(object);
        ao.a(object2);
        this.b = null;
        if (this.c.containsKey(object)) {
            a.a("Adding duplicate key '{}' to registry", object);
        }
        this.c.put(object, object2);
    }

    @Override
    public Set c() {
        return Collections.unmodifiableSet(this.c.keySet());
    }

    public Object a(Random random) {
        if (this.b == null) {
            Collection collection = this.c.values();
            if (collection.isEmpty()) {
                return null;
            }
            this.b = collection.toArray(new Object[collection.size()]);
        }
        return this.b[random.nextInt(this.b.length)];
    }

    public boolean c(Object object) {
        return this.c.containsKey(object);
    }

    public Iterator iterator() {
        return this.c.values().iterator();
    }
}

