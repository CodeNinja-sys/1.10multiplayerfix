/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.bl;
import com.a.a.b.bx;
import com.a.a.b.cl;
import com.a.a.b.cn;
import com.a.a.d.mq;
import com.a.a.m.az;
import com.a.a.m.ba;
import com.a.a.m.bb;
import com.a.a.m.bh;
import com.a.a.m.bm;
import com.a.a.m.bn;
import com.a.a.m.bo;
import java.lang.reflect.Array;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

final class ay {
    private static final bl a = new az();
    private static final bx b = bx.a(", ").b("null");

    static Type a(Type type) {
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType)type;
            Type[] arrtype = wildcardType.getLowerBounds();
            cl.a(arrtype.length <= 1, (Object)"Wildcard cannot have more than one lower bounds.");
            if (arrtype.length == 1) {
                return ay.c(ay.a(arrtype[0]));
            }
            Type[] arrtype2 = wildcardType.getUpperBounds();
            cl.a(arrtype2.length == 1, (Object)"Wildcard should have only one upper bound.");
            return ay.b(ay.a(arrtype2[0]));
        }
        return bh.c.a(type);
    }

    static ParameterizedType a(Type type, Class class_, Type ... arrtype) {
        if (type == null) {
            return ay.a(class_, arrtype);
        }
        cl.a(arrtype);
        cl.a(class_.getEnclosingClass() != null, "Owner type for unenclosed %s", new Object[]{class_});
        return new bm(type, class_, arrtype);
    }

    static ParameterizedType a(Class class_, Type ... arrtype) {
        return new bm(bb.c.a(class_), class_, arrtype);
    }

    static TypeVariable a(GenericDeclaration genericDeclaration, String string, Type ... arrtype) {
        Type[] arrtype2;
        if (arrtype.length == 0) {
            Type[] arrtype3 = new Type[1];
            arrtype2 = arrtype3;
            arrtype3[0] = Object.class;
        } else {
            arrtype2 = arrtype;
        }
        return new bn(genericDeclaration, string, arrtype2);
    }

    static WildcardType b(Type type) {
        return new bo(new Type[0], new Type[]{type});
    }

    static WildcardType c(Type type) {
        return new bo(new Type[]{type}, new Type[]{Object.class});
    }

    static String d(Type type) {
        return type instanceof Class ? ((Class)type).getName() : type.toString();
    }

    static Type e(Type type) {
        cl.a(type);
        AtomicReference atomicReference = new AtomicReference();
        new ba(atomicReference).a(type);
        return (Type)atomicReference.get();
    }

    private static Type b(Type[] arrtype) {
        for (Type type : arrtype) {
            Class class_;
            Type type2 = ay.e(type);
            if (type2 == null) continue;
            if (type2 instanceof Class && (class_ = (Class)type2).isPrimitive()) {
                return class_;
            }
            return ay.b(type2);
        }
        return null;
    }

    private static Type[] b(Collection collection) {
        return collection.toArray(new Type[collection.size()]);
    }

    private static Iterable b(Iterable iterable) {
        return mq.c(iterable, cn.a(cn.a(Object.class)));
    }

    private static void b(Type[] arrtype, String string) {
        for (Type type : arrtype) {
            if (!(type instanceof Class)) continue;
            Class class_ = (Class)type;
            cl.a(!class_.isPrimitive(), "Primitive type '%s' used as %s", new Object[]{class_, string});
        }
    }

    static Class a(Class class_) {
        return Array.newInstance(class_, 0).getClass();
    }

    private ay() {
    }

    static /* synthetic */ Type a(Type[] arrtype) {
        return ay.b(arrtype);
    }

    static /* synthetic */ void a(Type[] arrtype, String string) {
        ay.b(arrtype, string);
    }

    static /* synthetic */ Type[] a(Collection collection) {
        return ay.b(collection);
    }

    static /* synthetic */ bl a() {
        return a;
    }

    static /* synthetic */ bx b() {
        return b;
    }

    static /* synthetic */ Iterable a(Iterable iterable) {
        return ay.b(iterable);
    }
}

