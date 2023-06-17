/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b;

import com.a.b.a.a;
import com.a.b.a.d;
import com.a.b.an;
import com.a.b.ap;
import com.a.b.b;
import com.a.b.b.t;
import com.a.b.c;
import com.a.b.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class s
implements ap,
Cloneable {
    private static final double b = -1.0;
    public static final s a = new s();
    private double c = -1.0;
    private int d = 136;
    private boolean e = true;
    private boolean f;
    private List g = Collections.emptyList();
    private List h = Collections.emptyList();

    protected s a() {
        try {
            return (s)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public s a(double d2) {
        s s2 = this.a();
        s2.c = d2;
        return s2;
    }

    public s a(int ... arrn) {
        s s2 = this.a();
        s2.d = 0;
        for (int n2 : arrn) {
            s2.d |= n2;
        }
        return s2;
    }

    public s b() {
        s s2 = this.a();
        s2.e = false;
        return s2;
    }

    public s c() {
        s s2 = this.a();
        s2.f = true;
        return s2;
    }

    public s a(b b2, boolean bl2, boolean bl3) {
        s s2 = this.a();
        if (bl2) {
            s2.g = new ArrayList(this.g);
            s2.g.add(b2);
        }
        if (bl3) {
            s2.h = new ArrayList(this.h);
            s2.h.add(b2);
        }
        return s2;
    }

    public an a(k k2, com.a.b.c.a a2) {
        Class class_ = a2.a();
        boolean bl2 = this.a(class_, true);
        boolean bl3 = this.a(class_, false);
        if (!bl2 && !bl3) {
            return null;
        }
        return new t(this, bl3, bl2, k2, a2);
    }

    public boolean a(Field field, boolean bl2) {
        Object object;
        if ((this.d & field.getModifiers()) != 0) {
            return true;
        }
        if (this.c != -1.0 && !this.a(field.getAnnotation(com.a.b.a.c.class), field.getAnnotation(d.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.f && ((object = field.getAnnotation(a.class)) == null || (bl2 ? !object.a() : !object.b()))) {
            return true;
        }
        if (!this.e && this.b(field.getType())) {
            return true;
        }
        if (this.a(field.getType())) {
            return true;
        }
        Object object2 = object = bl2 ? this.g : this.h;
        if (!object.isEmpty()) {
            c c2 = new c(field);
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                b b2 = (b)iterator.next();
                if (!b2.a(c2)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean a(Class class_, boolean bl2) {
        if (this.c != -1.0 && !this.a(class_.getAnnotation(com.a.b.a.c.class), class_.getAnnotation(d.class))) {
            return true;
        }
        if (!this.e && this.b(class_)) {
            return true;
        }
        if (this.a(class_)) {
            return true;
        }
        List list = bl2 ? this.g : this.h;
        for (b b2 : list) {
            if (!b2.a(class_)) continue;
            return true;
        }
        return false;
    }

    private boolean a(Class class_) {
        return !Enum.class.isAssignableFrom(class_) && (class_.isAnonymousClass() || class_.isLocalClass());
    }

    private boolean b(Class class_) {
        return class_.isMemberClass() && !this.c(class_);
    }

    private boolean c(Class class_) {
        return (class_.getModifiers() & 8) != 0;
    }

    private boolean a(com.a.b.a.c c2, d d2) {
        return this.a(c2) && this.a(d2);
    }

    private boolean a(com.a.b.a.c c2) {
        double d2;
        return c2 == null || !((d2 = c2.a()) > this.c);
    }

    private boolean a(d d2) {
        double d3;
        return d2 == null || !((d3 = d2.a()) <= this.c);
    }

    protected /* synthetic */ Object clone() {
        return this.a();
    }
}

