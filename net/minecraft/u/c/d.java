/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.c;

import java.util.Random;
import net.minecraft.u.c.c;
import org.apache.commons.c.ao;

public class d
extends c {
    private final Object d;
    private Object e;

    public d(Object object) {
        this.d = object;
    }

    @Override
    public void a(int n2, Object object, Object object2) {
        if (this.d.equals(object)) {
            this.e = object2;
        }
        super.a(n2, object, object2);
    }

    public void b() {
        ao.a(this.e, "Missing default of DefaultedMappedRegistry: " + this.d, new Object[0]);
    }

    @Override
    public int d(Object object) {
        int n2 = super.d(object);
        return n2 == -1 ? super.d(this.e) : n2;
    }

    @Override
    public Object b(Object object) {
        Object object2 = super.b(object);
        return object2 == null ? this.d : object2;
    }

    @Override
    public Object a(Object object) {
        Object object2 = super.a(object);
        return object2 == null ? this.e : object2;
    }

    @Override
    public Object a(int n2) {
        Object object = super.a(n2);
        return object == null ? this.e : object;
    }

    @Override
    public Object a(Random random) {
        Object object = super.a(random);
        return object == null ? this.e : object;
    }
}

