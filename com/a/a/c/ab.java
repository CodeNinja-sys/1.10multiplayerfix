/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.c.ac;
import com.a.a.c.ae;
import com.a.a.c.ag;
import com.a.a.c.ah;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class ab {
    protected ab() {
    }

    public abstract Object a(Object var1);

    public dl a(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        return ci.a(this.a(object));
    }

    public Map a(Iterable iterable) {
        throw new ah();
    }

    public static ab a(bl bl2) {
        return new ae(bl2);
    }

    public static ab a(dx dx2) {
        return new ag(dx2);
    }

    public static ab a(ab ab2, Executor executor) {
        cl.a(ab2);
        cl.a(executor);
        return new ac(ab2, executor);
    }
}

