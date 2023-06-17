/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.d.mq;
import com.a.a.d.ov;
import java.lang.reflect.Array;
import java.util.ArrayList;
import net.minecraft.u.b.j;
import net.minecraft.u.b.k;

public class i {
    public static Iterable a(Class class_, Iterable iterable) {
        return new k(class_, (Iterable[])i.b(Iterable.class, iterable), null);
    }

    public static Iterable a(Iterable iterable) {
        return i.b(i.a(Object.class, iterable));
    }

    private static Iterable b(Iterable iterable) {
        return mq.a(iterable, new j(null));
    }

    private static Object[] b(Class class_, Iterable iterable) {
        ArrayList arrayList = ov.a();
        for (Object t2 : iterable) {
            arrayList.add(t2);
        }
        return arrayList.toArray(i.b(class_, arrayList.size()));
    }

    private static Object[] b(Class class_, int n2) {
        return (Object[])Array.newInstance(class_, n2);
    }

    static /* synthetic */ Object[] a(Class class_, int n2) {
        return i.b(class_, n2);
    }
}

