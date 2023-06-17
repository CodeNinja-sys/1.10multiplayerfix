/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.aad;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.u.f;

public class e
extends AbstractSet {
    private static final Set a = aad.a();
    private final Map b = sz.c();
    private final Set c = aad.e();
    private final Class d;
    private final List e = ov.a();

    public e(Class class_) {
        this.d = class_;
        this.c.add(class_);
        this.b.put(class_, this.e);
        for (Class class_2 : a) {
            this.a(class_2);
        }
    }

    protected void a(Class class_) {
        a.add(class_);
        for (Object e2 : this.e) {
            if (!class_.isAssignableFrom(e2.getClass())) continue;
            this.a(e2, class_);
        }
        this.c.add(class_);
    }

    protected Class b(Class class_) {
        if (this.d.isAssignableFrom(class_)) {
            if (!this.c.contains(class_)) {
                this.a(class_);
            }
            return class_;
        }
        throw new IllegalArgumentException("Don't know how to search for " + class_);
    }

    @Override
    public boolean add(Object object) {
        for (Class class_ : this.c) {
            if (!class_.isAssignableFrom(object.getClass())) continue;
            this.a(object, class_);
        }
        return true;
    }

    private void a(Object object, Class class_) {
        List list = (List)this.b.get(class_);
        if (list == null) {
            this.b.put(class_, ov.a(object));
        } else {
            list.add(object);
        }
    }

    @Override
    public boolean remove(Object object) {
        Object object2 = object;
        boolean bl2 = false;
        for (Class class_ : this.c) {
            List list;
            if (!class_.isAssignableFrom(object2.getClass()) || (list = (List)this.b.get(class_)) == null || !list.remove(object2)) continue;
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean contains(Object object) {
        return nj.a(this.c(object.getClass()).iterator(), object);
    }

    public Iterable c(Class class_) {
        return new f(this, class_);
    }

    @Override
    public Iterator iterator() {
        return this.e.isEmpty() ? nj.a() : nj.a(this.e.iterator());
    }

    @Override
    public int size() {
        return this.e.size();
    }

    static /* synthetic */ Map a(e e2) {
        return e2.b;
    }
}

